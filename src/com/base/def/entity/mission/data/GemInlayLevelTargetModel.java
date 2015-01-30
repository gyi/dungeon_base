package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 镶嵌宝石等级目标模型
 */
public class GemInlayLevelTargetModel extends TargetModel {

	private static final long serialVersionUID = 6350880009027815804L;

	private GemInlayLevelTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.GEM_INLAY_TARGET_VALUE;
	}

	public static GemInlayLevelTargetModel build() {
		GemInlayLevelTargetModel gemInlayLevelTargetModel = new GemInlayLevelTargetModel();
		return gemInlayLevelTargetModel;
	}
}
