package com.base.data.module;

import java.util.HashMap;
import java.util.Map;

import com.base.data.ModuleData;
import com.base.data.ModuleType;

/**
 * 
 * @Create time : 2014-6-18
 * @author : ZhangQiang
 * @Description : 限定商店数据
 */

public class ShopData extends ModuleData {

	private static final long serialVersionUID = -7707161479256604638L;

	private Map<Integer, Integer> qualified = new HashMap<>();

	@Override
	public ModuleType moduleType() {
		return ModuleType.shop;
	}

	public Map<Integer, Integer> getQualified() {
		return qualified;
	}

	public void setQualified(Map<Integer, Integer> qualified) {
		this.qualified = qualified;
	}

}
