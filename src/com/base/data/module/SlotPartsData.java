package com.base.data.module;

import java.util.HashMap;
import java.util.Map;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.RolePart;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @Create time : 2015-1-4
 * @author : sunhua
 * @Description : 装备槽模块数据
 */
public class SlotPartsData extends ModuleData {
	private static final long serialVersionUID = 7422917482833748473L;
	// 装备槽装备列表
	private final Map<Integer, RolePart> slotParts = new HashMap<>();

	public Map<Integer, RolePart> getSlotParts() {
		return slotParts;
	}

	@Override
	@JsonIgnore
	public ModuleType moduleType() {
		return ModuleType.slotParts;
	}

}
