package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 等级达到目标模型
 */
public class LevelUpTargetModel extends TargetModel {

	private static final long serialVersionUID = 4974280646986120059L;
	private int level;// 达到等级

	private LevelUpTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.LEVEL_UP_TARGET_VALUE;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public static LevelUpTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		int defLevel = Integer.valueOf(targetDefs[0]);// 配置等级
		LevelUpTargetModel levelUpTargetModel = new LevelUpTargetModel();
		levelUpTargetModel.setLevel(defLevel);
		return levelUpTargetModel;
	}

}
