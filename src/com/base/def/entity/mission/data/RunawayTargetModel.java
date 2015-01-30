package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 跑路目标模型
 */
public class RunawayTargetModel extends TargetModel {
	private static final long serialVersionUID = 6465611604576151044L;
	private int startNpc;// 开始NPC
	private int endNpc;// 结束NPC

	private RunawayTargetModel() {
	}

	public int getStartNpc() {
		return startNpc;
	}

	public void setStartNpc(int startNpc) {
		this.startNpc = startNpc;
	}

	public int getEndNpc() {
		return endNpc;
	}

	public void setEndNpc(int endNpc) {
		this.endNpc = endNpc;
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.RUN_AWAY_TARGET_VALUE;
	}

	public static RunawayTargetModel build(String[] targetDefs, int missionId) {
		if (targetDefs.length != 2)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		RunawayTargetModel runawayTargetModel = new RunawayTargetModel();
		runawayTargetModel.setStartNpc(Integer.valueOf(targetDefs[0]));
		runawayTargetModel.setEndNpc(Integer.valueOf(targetDefs[1]));
		return runawayTargetModel;
	}
}
