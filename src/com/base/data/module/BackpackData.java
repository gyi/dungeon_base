package com.base.data.module;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.Item;

/**
 * 
 * @Create time : 2014-12-2
 * @author : zhaowei
 * @Description : TODO 背包信息
 */
public class BackpackData extends ModuleData {

	private static final long serialVersionUID = 5860111109852084378L;

	private Map<String, Item> backpackMap = new ConcurrentHashMap<>();// 背包信息
	/* 扩充格子数量 */
	private int occupy;

	@Override
	public ModuleType moduleType() {
		return ModuleType.backpack;
	}

	public Map<String, Item> getBackpackMap() {
		return backpackMap;
	}

	public void setBackpackMap(Map<String, Item> backpackMap) {
		this.backpackMap = backpackMap;
	}

	public int getOccupy() {
		return occupy;
	}

	public void setOccupy(int occupy) {
		this.occupy = occupy;
	}
}
