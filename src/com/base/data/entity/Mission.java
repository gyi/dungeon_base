package com.base.data.entity;

import java.io.Serializable;
import java.util.List;

import com.base.pb.MsgDefineMission.MissionStatus;
import com.base.pb.MsgDefineMission.MissionTargetType;

/**
 * 
 * @Create time : 2014-8-4
 * @author : zhuqd
 * @Description :
 */
public class Mission implements Serializable {
	private static final long serialVersionUID = 3171898807041410567L;

	private int defId; // 定义ID
	private MissionStatus status;// 任务状态
	private List<Target> targets;// 任务目标

	public int getDefId() {
		return defId;
	}

	public List<Target> getTargets() {
		return targets;
	}

	public void setTargets(List<Target> targets) {
		this.targets = targets;
	}

	public void setDefId(int defId) {
		this.defId = defId;
	}

	public MissionStatus getStatus() {
		return status;
	}

	public void setStatus(MissionStatus status) {
		this.status = status;
	}

	public static final class Target {
		private int missionId;// 任务id
		private int performNum; // (击杀,关卡)完成数量
		private MissionTargetType targetType; // 任务目标类型
		private boolean isComplete;// 是否完成目标
		private int targetMark;// 任务下标

		public MissionTargetType getTargetType() {
			return targetType;
		}

		public void setTargetType(MissionTargetType targetType) {
			this.targetType = targetType;
		}

		public int getPerformNum() {
			return performNum;
		}

		public void setPerformNum(int performNum) {
			this.performNum = performNum;
		}

		public boolean isComplete() {
			return isComplete;
		}

		public void setComplete(boolean isComplete) {
			this.isComplete = isComplete;
		}

		public int getMissionId() {
			return missionId;
		}

		public void setMissionId(int missionId) {
			this.missionId = missionId;
		}

		public int getTargetMark() {
			return targetMark;
		}

		public void setTargetMark(int targetMark) {
			this.targetMark = targetMark;
		}
	}
}
