package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 战斗力达到目标模型
 */
public class EffectValueUpTargetModel extends TargetModel {

	private static final long serialVersionUID = 6631512932316311172L;
	private int effectValue;// 战斗力

	private EffectValueUpTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.EFFECT_UP_TARGET_VALUE;
	}

	public int getEffectValue() {
		return effectValue;
	}

	public void setEffectValue(int effectValue) {
		this.effectValue = effectValue;
	}

	public static EffectValueUpTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		int defEffectVal = Integer.valueOf(targetDefs[0]);// 战斗力配置
		EffectValueUpTargetModel effectValueUpTargetModel = new EffectValueUpTargetModel();
		effectValueUpTargetModel.setEffectValue(defEffectVal);
		return effectValueUpTargetModel;
	}

}
