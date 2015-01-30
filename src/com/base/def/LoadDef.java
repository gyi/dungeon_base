package com.base.def;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.core.general.JsonHelper;
import com.core.net.http.request.AbstractHttpRequestWork;
import com.core.server.work.Args;
import com.core.server.work.WorkQueue;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * 
 * @Create 2013-12-31
 * @author wangl
 * @Description 加载配置
 */
public class LoadDef extends AbstractHttpRequestWork {

	private WorkQueue workQueue;
	private String secretKey;
	private String url;
	private List<String> defClassList;

	@Override
	public void init(Args args) throws ClassCastException, ArrayIndexOutOfBoundsException {
		workQueue = args.read();
		secretKey = args.read();
		url = args.read();
		for (int i = 0; i < args.readableLen(); i++) {
			defClassList.add((String) args.read());
		}
	}

	@Override
	public WorkQueue queue() {
		return workQueue;
	}

	@Override
	protected String secretKey() {
		return secretKey;
	}

	@Override
	protected String getUrl() {
		return url;
	}

	@Override
	protected void init(Map<String, String> params) {
		if (defClassList != null) {
			StringBuffer stringBuffer = new StringBuffer();
			for (String clazz : defClassList) {
				stringBuffer.append(clazz);
			}
			params.put("class", stringBuffer.toString());
		} else {
			params.put("class", "");
		}
	}

	@Override
	protected void receive(String response) {
		JavaType mapType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, String.class);
		Map<String, String> map = null;
		try {
			map = JsonHelper.json2Obj(response, mapType);
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		}
		for (Entry<String, String> entry : map.entrySet()) {
			try {
				Class<?> defClass = Class.forName(entry.getKey());
				JavaType valueType = TypeFactory.defaultInstance().constructArrayType(defClass);
				BaseDef<? extends Serializable>[] baseDefs = JsonHelper.json2Obj(response, valueType);
				for (BaseDef<? extends Serializable> baseDef : baseDefs) {
					DefFactory.instance().put(baseDef.getDefType(), baseDef);
				}

				logger.debug("load def: {}, num: {}", entry.getKey(), baseDefs.length);
			} catch (Exception e) {
				logger.error("load def: {} error!", entry.getKey());
			}
		}

		DefFactory.instance().setLoadOver(true);// 加载完成
	}

}
