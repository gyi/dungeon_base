package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 击杀怪物目标模型
 */
public class KillTargetModel extends TargetModel {
	private static final long serialVersionUID = -1949166907553191928L;
	private int killNumber;// 击杀数量
	private int monsterId;// 怪物id

	private KillTargetModel() {
	}

	public int getKillNumber() {
		return killNumber;
	}

	public void setKillNumber(int killNumber) {
		this.killNumber = killNumber;
	}

	public int getMonsterId() {
		return monsterId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.KILL_MONSTER_TARGET_VALUE;
	}

	public static KillTargetModel build(String[] targetDefs, int missionId) {
		// 检查配置是否正确
		if (targetDefs.length != 1 && targetDefs.length != 2)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		KillTargetModel killTargetModel = new KillTargetModel();
		if (targetDefs.length == 2) {
			int defMonsterId = Integer.valueOf(targetDefs[0]);
			int killNum = Integer.valueOf(targetDefs[1]);
			killTargetModel.setMonsterId(defMonsterId);
			killTargetModel.setKillNumber(killNum);
		} else {
			int killNum = Integer.valueOf(targetDefs[0]);
			killTargetModel.setKillNumber(killNum);
		}
		return killTargetModel;
	}

}
