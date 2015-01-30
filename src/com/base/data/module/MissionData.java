package com.base.data.module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.base.data.ModuleData;
import com.base.data.ModuleType;
import com.base.data.entity.Mission;
import com.base.data.entity.Mission.Target;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @Create time : 2015-1-14
 * @author : zhaowei
 * @Description : TODO 任务数据
 */
public class MissionData extends ModuleData {

	private static final long serialVersionUID = 548144805601620826L;

	// 进行中的任务详细<任务id， 任务>
	private Map<Integer, Mission> misson = new HashMap<>();
	// <任务目标类型, 任务目标>
	private Map<Integer, List<Target>> targets = new HashMap<>();
	// 完成任务
	private List<Integer> performMission = new ArrayList<Integer>();

	@Override
	@JsonIgnore
	public ModuleType moduleType() {
		return ModuleType.mission;
	}

	public Map<Integer, Mission> getMisson() {
		return misson;
	}

	public void setMisson(Map<Integer, Mission> misson) {
		this.misson = misson;
	}

	@JsonIgnore
	public Map<Integer, List<Target>> getTargets() {
		return targets;
	}

	public void setTargets(Map<Integer, List<Target>> targets) {
		this.targets = targets;
	}

	public List<Integer> getPerformMission() {
		return performMission;
	}

	public void setPerformMission(List<Integer> performMission) {
		this.performMission = performMission;
	}

}
