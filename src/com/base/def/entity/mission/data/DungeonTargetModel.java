package com.base.def.entity.mission.data;

import com.base.def.entity.mission.TargetModel;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 关卡目标模型
 */
public class DungeonTargetModel extends TargetModel {
	private static final long serialVersionUID = 7996786360866565473L;
	private int dugeonId;// 关卡id
	private int repeatTime;// 重复次数

	private DungeonTargetModel() {
	}

	public int getDugeonId() {
		return dugeonId;
	}

	public void setDugeonId(int dugeonId) {
		this.dugeonId = dugeonId;
	}

	public int getRepeatTime() {
		return repeatTime;
	}

	public void setRepeatTime(int repeatTime) {
		this.repeatTime = repeatTime;
	}

	@Override
	public int getTagetType() {
		return MissionTargetType.DUNGEON_TARGET_VALUE;
	}

	public static DungeonTargetModel build(String[] targetDefs, int missionId) {
		// 检查配置是否正确
		if (targetDefs.length != 2 && targetDefs.length != 1)
			throw new RuntimeException("target def is wrong, missionId=" + missionId);
		DungeonTargetModel dungeonTargetModel = new DungeonTargetModel();
		if (targetDefs.length == 2) {
			int defDugeonId = Integer.valueOf(targetDefs[0]);
			int repeatTime = Integer.valueOf(targetDefs[1]);
			dungeonTargetModel.setDugeonId(defDugeonId);
			dungeonTargetModel.setRepeatTime(repeatTime);
		} else {
			int repeatTime = Integer.valueOf(targetDefs[0]);
			dungeonTargetModel.setRepeatTime(repeatTime);
		}
		return dungeonTargetModel;
	}
}
