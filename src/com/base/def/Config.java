package com.base.def;

import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @Create 2013-12-31
 * @author wangl
 * @Description 基础配置
 */
public abstract class Config {
	private static Logger logger = LoggerFactory.getLogger(Config.class);
	private static Set<String> initSet = new HashSet<>();

	/**
	 * 利用反射设置config的值
	 * 
	 * @param configClass
	 * @param key
	 * @param valueString
	 * @throws Exception
	 */
	public static void reflectConfig(Class<? extends Config> configClass, String key, String valueString) throws Exception {
		Field field = null;
		try {
			// 鉴别配置key
			field = configClass.getDeclaredField(key);
		} catch (Exception e) {
			// logger.error("not find field {} from {}", key, configClass);
			return;
		}

		try {
			// 取得值类型
			IValueType valueType = field.getAnnotation(IValueType.class);
			if (valueType == null) {
				throw new RuntimeException("not find Annotation valueType from field " + field);
			}

			// 转换值类型，映射设置值
			Object value = ValueType.parse(valueType.value(), valueString);
			field.setAccessible(true);
			field.set(null, value);

			initSet.add(key);
			logger.debug("reflect config field {} = {}", key, value);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 加载配置文件
	 * 
	 * @param filePath
	 * @throws Exception
	 */
	public static void loadProperties(Class<? extends Config> configClass, String filePath) throws Exception {
		Properties p = new Properties();
		p.load(new FileInputStream(filePath));
		for (Entry<Object, Object> entry : p.entrySet()) {
			reflectConfig(configClass, entry.getKey().toString(), entry.getValue().toString());
		}
	}

	/**
	 * 检测配置是否初始化
	 * 
	 * @param configClass
	 */
	public static void checkInit(Class<? extends Config> configClass) {
		Field[] fields = configClass.getDeclaredFields();
		for (Field field : fields) {
			if (field.getAnnotation(IValueType.class) == null) {
				continue;
			}
			if (!initSet.contains(field.getName())) {
				throw new RuntimeException("not init Config key = " + field.getName());
			}
		}
		initSet.clear();
	}

}
