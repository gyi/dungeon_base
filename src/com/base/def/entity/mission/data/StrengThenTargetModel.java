package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 强化次数目标模型
 */
public class StrengThenTargetModel extends TargetModel {

	private static final long serialVersionUID = 6966321473199951070L;
	private int time;// 强化次数

	private StrengThenTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.STRENG_THEN_TARGET_VALUE;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public static StrengThenTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		int defTime = Integer.valueOf(targetDefs[0]);// 强化次数
		StrengThenTargetModel strengThenTargetModel = new StrengThenTargetModel();
		strengThenTargetModel.setTime(defTime);
		return strengThenTargetModel;
	}

}
