package com.base.data.module;

import java.util.ArrayList;
import java.util.List;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.MysteryShopItem;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhangqiang
 * @Description : 神秘商店数据
 */
public class MysteryShopItemData extends ModuleData {

	private static final long serialVersionUID = 4870707325709449731L;

	private List<MysteryShopItem> mysteryShopItems = new ArrayList<MysteryShopItem>();// 商品Id
	private long lastRefurbishTime;// 上次刷新时间

	@Override
	@JsonIgnore
	public ModuleType moduleType() {
		return ModuleType.mysteryshopitem;
	}

	public List<MysteryShopItem> getMysteryShopItems() {
		return mysteryShopItems;
	}

	public void setMysteryShopItems(List<MysteryShopItem> mysteryShopItems) {
		this.mysteryShopItems = mysteryShopItems;
	}

	public long getLastRefurbishTime() {
		return lastRefurbishTime;
	}

	public void setLastRefurbishTime(long lastRefurbishTime) {
		this.lastRefurbishTime = lastRefurbishTime;
	}

}
