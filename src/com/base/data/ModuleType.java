package com.base.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.data.module.BackpackData;
import com.base.data.module.BasicData;
import com.base.data.module.ForgeData;
import com.base.data.module.MailData;
import com.base.data.module.MapData;
import com.base.data.module.MissionData;
import com.base.data.module.MysteryShopItemData;
import com.base.data.module.PropertyData;
import com.base.data.module.ShopData;
import com.base.data.module.SlotPartsData;
import com.base.data.module.SocialData;

/**
 * 
 * @Create time : 2014-4-24
 * @author : wangl
 * @Description : 模块定义
 */
public enum ModuleType {

	/** 角色基础信息 */
	basic(BasicData.class),

	/** 角色属性 */
	property(PropertyData.class),

	/** 地图信息 */
	map(MapData.class),

	/** 邮件信息 */
	mail(MailData.class),

	/** 商店信息 */
	shop(ShopData.class),

	/** 好友列表 */
	social(SocialData.class),

	/** 背包信息 */
	backpack(BackpackData.class),

	/** 装备槽信息 */
	slotParts(SlotPartsData.class),

	/** 锻造信息 */
	forge(ForgeData.class),

	/** 任务信息 */
	mission(MissionData.class),

	/** 神秘商店信息 */
	mysteryshopitem(MysteryShopItemData.class);

	private static Logger logger = LoggerFactory.getLogger(ModuleType.class);
	private Class<? extends ModuleData> dataClass;// 实体类class

	private ModuleType(Class<? extends ModuleData> dataClass) {
		this.dataClass = dataClass;

	}

	/**
	 * 该type对用的实体类
	 * 
	 * @return
	 */
	public Class<? extends ModuleData> dataClass() {
		return dataClass;
	}

	@SuppressWarnings("unchecked")
	public <T extends ModuleData> T newData() {
		ModuleData data = null;
		try {
			data = dataClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			logger.error("newData error", e);
		}
		return (T) data;
	}
}
