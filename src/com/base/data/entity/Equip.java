package com.base.data.entity;

import java.util.HashMap;
import java.util.Map;

import com.core.general.StringHelper;

/**
 * 
 * @Create time : 2015-1-4
 * @author : sunhua
 * @Description : 装备
 */
public class Equip extends Item {
	private static final long serialVersionUID = 6156920126196546275L;
	private String uuid;
	// 位置属性键值对
	private final Map<Integer, PropertyValue> randAttributes = new HashMap<>();
	// 位置属性键值对
	private final Map<Integer, PropertyValue> strenthAttributes = new HashMap<>();

	public Equip() {
		this.setUuid(StringHelper.randUUID());
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Map<Integer, PropertyValue> getRandAttributes() {
		return randAttributes;
	}

	public Map<Integer, PropertyValue> getStrenthAttributes() {
		return strenthAttributes;
	}

}
