package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 洗练次数目标模型
 */
public class PolishTargetModel extends TargetModel {

	private static final long serialVersionUID = 4730877227106553467L;
	private int time;// 洗练次数

	private PolishTargetModel() {
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.POLISH_TRAGET_VALUE;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public static PolishTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		int defTime = Integer.valueOf(targetDefs[0]);
		PolishTargetModel polishTargetModel = new PolishTargetModel();
		polishTargetModel.setTime(defTime);
		return polishTargetModel;
	}

}
