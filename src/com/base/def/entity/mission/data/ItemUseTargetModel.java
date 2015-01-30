package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 物品使用目标模型
 */
public class ItemUseTargetModel extends TargetModel {

	private static final long serialVersionUID = -4104980152373948113L;
	private int itemId;// 物品ID

	private ItemUseTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.ITEM_USE_TARGET_VALUE;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public static ItemUseTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		int defItemId = Integer.valueOf(targetDefs[0]);// 配置中的物品id
		ItemUseTargetModel itemUseTargetModel = new ItemUseTargetModel();
		itemUseTargetModel.setItemId(defItemId);
		return itemUseTargetModel;
	}
}
