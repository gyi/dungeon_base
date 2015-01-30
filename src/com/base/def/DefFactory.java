package com.base.def;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import net.contentobjects.jnotify.JNotify;
import net.contentobjects.jnotify.JNotifyListener;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.def.type.ConfigDef;
import com.core.general.GenericsUtils;
import com.core.general.IServerLoad;
import com.core.general.StringHelper;
import com.core.server.work.WorkManager;
import com.core.server.work.WorkQueue;
import com.xe.xml.DefDataTool;

/**
 * 
 * @Create 2013-12-30
 * @author wangl
 * @Description 配置工厂
 */
public class DefFactory implements IServerLoad, JNotifyListener {
	private static Logger logger = LoggerFactory.getLogger(DefFactory.class);
	private static String XML_SUFFIX = ".xml";
	private static int mask = JNotify.FILE_CREATED | JNotify.FILE_MODIFIED;
	private static DefFactory defFactory = new DefFactory();

	public static DefFactory instance() {
		return defFactory;
	}

	private Map<String, Long> xmlVersionMap;

	private Map<String, ArrayList<BaseDef<? extends Serializable>>> listDefMap;// 有序listMap
	private Map<DefType, Map<Object, BaseDef<? extends Serializable>>> keyDefMap;// 主键id对应map
	private Class<? extends Config> configClass;// 键值对的配置数据
	private IReload iReload;// 配置重新加载以后的调用接口

	private boolean isLoadOver = true;

	private DefFactory() {
		int maxDefLen = DefType.values().length;
		xmlVersionMap = new HashMap<>();
		listDefMap = new ConcurrentHashMap<>(maxDefLen);
		keyDefMap = new ConcurrentHashMap<>(maxDefLen);
	}

	/**
	 * 初始化配置工厂
	 * 
	 * @param configClass
	 *            设置config类型数据的对应class
	 */
	public void init(Class<? extends Config> configClass, IReload iReload) {
		this.configClass = configClass;
		this.iReload = iReload;
	}

	/**
	 * 加载配置
	 * 
	 * @param loadQueue
	 *            加载队列
	 * @param url
	 *            http地址
	 * @param sercetKey
	 *            公用密钥
	 * @param types
	 *            需要加载的配置类型
	 */
	public void loadDef(WorkQueue loadQueue, String url, String sercetKey, DefType... types) {
		isLoadOver = false;
		for (DefType defType : types) {
			WorkManager.instance().submitDynamicWork(LoadDef.class, loadQueue, url, sercetKey, defType);
		}
	}

	/**
	 * 加载配置数据
	 * 
	 * @throws Exception
	 */
	public void loadTest() throws Exception {
		isLoadOver = false;
		Map<String, List<Object>> dataMap = DefDataTool.instance().getBaseObjectMap();
		for (Entry<String, List<Object>> entry : dataMap.entrySet()) {
			for (Object baseDef : entry.getValue()) {
				try {
					BaseDef<?> def = (BaseDef<?>) baseDef;
					put(def.getDefType(), def);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			logger.debug("load test def {}, size = {}", entry.getKey(), entry.getValue().size());
		}

		String xmlPath = System.getProperty("user.dir") + File.separator + "xml";
		JNotify.addWatch(xmlPath, mask, true, this);

		isLoadOver = true;

		// 通知加载完成
		iReload.afterLoadOver();
	}

	@Override
	public boolean isOK() {
		return isLoadOver;
	}

	/**
	 * 放入数据到配置缓存，如果id主键的映射有旧值，则将新配置数据反射到原来的def上
	 * 
	 * @param type
	 * @param def
	 * @return 是否为reload
	 * @throws Exception
	 */
	public <T extends BaseDef<PK>, PK extends Serializable> boolean put(DefType type, T def) throws Exception {
		if (type.equals(DefType.CONFIG) && this.configClass != null) {// 键值对的配置特殊处理
			ConfigDef configDef = (ConfigDef) def;
			Config.reflectConfig(this.configClass, configDef.getKey(), configDef.getValue());
		}
		Map<Object, BaseDef<? extends Serializable>> defMap = keyDefMap.get(type);
		if (defMap == null) {
			defMap = new ConcurrentHashMap<>();
			keyDefMap.put(type, defMap);
		}

		if (def.getId() == null) {
			throw new NullPointerException("def.getId() is null, def = " + def.getClass());
		}
		BaseDef<? extends Serializable> olDef = defMap.get(def.getId());
		if (olDef != null) {
			if (!isLoadOver) {
				throw new RuntimeException(type + " same id = " + def.getId());
			}
			try {
				GenericsUtils.distractField(def, olDef);
				logger.error("reload def, type = {}, id = {}", type, def.getId());
				return true;
			} catch (Exception e) {
				throw new RuntimeException("reload def error, type: " + def.getDefType() + ", id = " + def.getId(), e);
			}
		} else {
			defMap.put(def.getId(), def);
			return false;
		}
	}

	/**
	 * 清楚指定类型的查询list集合
	 * 
	 * @param type
	 */
	public void clearSortMap(DefType type) {
		for (String name : listDefMap.keySet()) {
			if (name.indexOf(type.name()) != -1) {
				listDefMap.remove(name);

				logger.debug("remove listDefMap, key = " + name);
			}
		}
	}

	/**
	 * 根据id获取def
	 * 
	 * @param type
	 * @param defId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends BaseDef<PK>, PK extends Serializable> T getDef(DefType type, PK defId) {
		Map<Object, BaseDef<? extends Serializable>> defMap = keyDefMap.get(type);
		if (defMap == null) {
			return null;
		}
		return (T) defMap.get(defId);
	}

	/**
	 * 根据动态构建的多字段组成key，获取def
	 * 
	 * @param type
	 * @param keyPropertys
	 *            组成key的字段值
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends BaseDef<? extends Serializable>> T getDef(DefType type, Object... keyPropertys) {
		Map<Object, BaseDef<? extends Serializable>> defMap = keyDefMap.get(type);
		if (defMap == null) {
			return null;
		}
		return (T) defMap.get(StringHelper.buildKey(keyPropertys));
	}

	/**
	 * 获取制定type的全部配置数据（不保证顺序）
	 * 
	 * @param type
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends BaseDef<? extends Serializable>> List<T> getList(DefType type) {
		Map<Object, BaseDef<? extends Serializable>> defMap = keyDefMap.get(type);
		if (defMap == null) {
			return null;
		}
		List<T> list = new ArrayList<>(defMap.size());
		list.addAll((Collection<? extends T>) defMap.values());
		return list;
	}

	/**
	 * 根据分组器对配置表分组
	 * 
	 * @param type
	 * @param group
	 * @return
	 */
	public <T extends BaseDef<? extends Serializable>> List<T> getGroupList(DefType type, IDefGroup<T> group) {
		return getGroupAndSortList(type, group, null);
	}

	/**
	 * 获取单个字段分组
	 * 
	 * @param type
	 *            配置类型
	 * @param groupFieldName
	 *            分组字段
	 * @param groupValue
	 *            分组匹配值
	 * @return
	 */
	public <T extends BaseDef<? extends Serializable>> List<T> getGroupList(DefType type, String groupFieldName, Object groupValue) {
		return getGroupAndSortList(type, groupFieldName, groupValue, null);
	}

	/**
	 * 获取单个字段分组并排序
	 * 
	 * @param type
	 *            配置类型
	 * @param groupFieldNames
	 *            分组字段名集合
	 * @param groupValues
	 *            分组匹配值集合
	 * @param sortFieldName
	 *            排序字段
	 * @return
	 */
	public <T extends BaseDef<? extends Serializable>> ArrayList<T> getGroupAndSortList(DefType type, String groupFieldName, Object groupValue,
			String sortFieldName) {
		return getGroupAndSortList(type, new FieldGroup<T>(groupFieldName, groupValue), sortFieldName);
	}

	/**
	 * 获取多个字段分组并排序
	 * 
	 * @param type
	 *            配置类型
	 * @param group
	 *            分组器
	 * @param sortFieldName
	 *            排序字段
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <T extends BaseDef<? extends Serializable>> ArrayList<T> getGroupAndSortList(DefType type, IDefGroup<T> group, String sortFieldName) {
		String listKey = StringHelper.buildKey(group.getKey(), sortFieldName);
		// System.out.println("listKey: " + listKey);

		// 优先查找缓存
		ArrayList<BaseDef<? extends Serializable>> defList = listDefMap.get(listKey);

		if (defList == null) {
			// 分组list
			defList = group(type, group);

			if (!StringUtils.isEmpty(sortFieldName)) {
				sort(defList, sortFieldName);
			}
			listDefMap.put(listKey, defList);
		}

		// copy一次，避免被外部更改
		return (ArrayList<T>) defList.clone();
	}

	/**
	 * 指定类型配置的数量
	 * 
	 * @param type
	 * @return
	 */
	public int size(DefType type) {
		if (keyDefMap.containsKey(type)) {
			return keyDefMap.get(type).size();
		}
		return 0;
	}

	/**
	 * 按字段分组
	 * 
	 * @param type
	 * @param groupFieldName
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private <T extends BaseDef<? extends Serializable>> ArrayList<BaseDef<? extends Serializable>> group(DefType type, IDefGroup<T> group) {
		// 构建新的list
		Collection<BaseDef<? extends Serializable>> cs = getList(type);
		if (cs == null || cs.size() == 0) {
			return new ArrayList<>();// 未找到相关数据
		}

		if (group == null) {
			return new ArrayList<>(cs);
		}
		try {
			// 生成group list
			ArrayList<BaseDef<? extends Serializable>> defList = new ArrayList<>();
			for (BaseDef<? extends Serializable> baseDef : cs) {
				if (group.isPass((T) baseDef)) {
					defList.add(baseDef);
				}
			}
			return defList;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 按字段排序
	 * 
	 * @param defList
	 * @param sortFieldName
	 */
	private void sort(List<BaseDef<? extends Serializable>> defList, String sortFieldName) {
		try {
			if (defList == null || defList.size() <= 0) {
				return;
			}
			final Field field = defList.get(0).getClass().getDeclaredField(sortFieldName);
			field.setAccessible(true);

			Collections.sort(defList, new Comparator<BaseDef<? extends Serializable>>() {

				@Override
				public int compare(BaseDef<? extends Serializable> o1, BaseDef<? extends Serializable> o2) {
					try {
						Object o1Value = field.get(o1);
						Object o2Value = field.get(o2);
						return o1Value.toString().compareTo(o2Value.toString());
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
			});
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public boolean isLoadOver() {
		return isLoadOver;
	}

	public void setLoadOver(boolean isLoadOver) {
		this.isLoadOver = isLoadOver;
	}

	public Map<DefType, Map<Object, BaseDef<? extends Serializable>>> getKeyDefMap() {
		return keyDefMap;
	}

	@Override
	public void fileCreated(int arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
	}

	@Override
	public void fileDeleted(int arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
	}

	@Override
	public void fileModified(int arg0, String arg1, String arg2) {
		try {
			loadXml(arg1 + File.separator + arg2);
		} catch (Exception e) {
			logger.error("reload xml [" + arg1 + File.separator + arg2 + "] error! ", e);
		}
	}

	@Override
	public void fileRenamed(int arg0, String arg1, String arg2, String arg3) {
		// TODO Auto-generated method stub
	}

	private void loadXml(String fileName) throws Exception {
		if (!fileName.endsWith(XML_SUFFIX)) {
			return;
		}
		File file = new File(fileName);
		Long lastModify = xmlVersionMap.get(fileName);
		if (lastModify != null && lastModify == file.lastModified()) {
			return;
		}

		List<Object> baseDefs = DefDataTool.loadXml(file, null);
		if (baseDefs == null || baseDefs.isEmpty()) {
			return;
		}

		DefType defType = ((BaseDef<?>) baseDefs.get(0)).getDefType();
		for (Object baseDef : baseDefs) {
			try {
				BaseDef<?> def = ((BaseDef<?>) baseDef);
				put(def.getDefType(), def);
			} catch (Exception e) {
				throw new RuntimeException("reload xml error");
			}
		}
		xmlVersionMap.put(fileName, file.lastModified());

		clearSortMap(defType);// 清除排序缓存

		if (iReload != null) {
			iReload.afterLoadOver();
			iReload.afterReload();
		}
	}

	/**
	 * 字段分组器
	 */
	class FieldGroup<T extends BaseDef<? extends Serializable>> implements IDefGroup<T> {

		private String[] fieldNames;// 字段名
		private Object[] fieldValues;// 字段值
		private Field[] groupFields;// 排序字段

		public FieldGroup(String fieldName, Object fieldValue) {
			this(new String[] { fieldName }, new Object[] { fieldValue });
		}

		public FieldGroup(String[] fieldNames, Object[] fieldValues) {
			this.fieldNames = fieldNames;
			this.fieldValues = fieldValues;
			this.groupFields = new Field[fieldNames.length];
		}

		@Override
		public boolean isPass(T def) throws Exception {
			for (int i = 0; i < groupFields.length; i++) {
				if (groupFields[i] == null) {
					groupFields[i] = def.getClass().getDeclaredField(fieldNames[i]);
					groupFields[i].setAccessible(true);
				}
				if (!groupFields[i].get(def).equals(fieldValues[i])) {
					return false;
				}
			}
			return true;
		}

		@Override
		public String getKey() {
			return ArrayUtils.toString(fieldNames) + ArrayUtils.toString(fieldValues);
		}

	}

}
