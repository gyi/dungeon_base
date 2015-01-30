package com.base.data.module;

import java.util.HashMap;
import java.util.Map;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.Item;

/**
 * 
 * @Create time : 2015-1-9
 * @author : yezhi
 * @Description : 角色锻造信息
 */
public class ForgeData extends ModuleData {
	private static final long serialVersionUID = -6977184170853662808L;

	private Map<Integer, Map<Integer, Item>> partMap = new HashMap<Integer, Map<Integer, Item>>();// 部位所对应的栏位

	@Override
	public ModuleType moduleType() {
		return ModuleType.forge;
	}

	public Map<Integer, Map<Integer, Item>> getPartMap() {
		return partMap;
	}

	public void setPartMap(Map<Integer, Map<Integer, Item>> partMap) {
		this.partMap = partMap;
	}

}
