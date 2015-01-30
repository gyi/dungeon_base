package com.base.data.module;

import com.base.data.ModuleData;
import com.base.data.ModuleType;

/**
 * 
 * @Create time : 2014-4-22
 * @author : wangl
 * @Description : 角色基础信息
 */
public class BasicData extends ModuleData {
	private static final long serialVersionUID = 7435167428744276088L;
	private long roleId;// 角色id
	private long playerId;// 玩家id
	private String nickName;// 昵称
	private int gold;// 金币
	private int sycee;// 元宝
	private int energy;// 体力
	private long offlineTime;// 离线时间
	private long dailyResetTime;// 每日重置时间
	private long energyAddingTime;// 体力回复时间

	@Override
	public ModuleType moduleType() {
		return ModuleType.basic;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getSycee() {
		return sycee;
	}

	public void setSycee(int sycee) {
		this.sycee = sycee;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public long getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(long offlineTime) {
		this.offlineTime = offlineTime;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public long getDailyResetTime() {
		return dailyResetTime;
	}

	public void setDailyResetTime(long dailyResetTime) {
		this.dailyResetTime = dailyResetTime;
	}

	public long getEnergyAddingTime() {
		return energyAddingTime;
	}

	public void setEnergyAddingTime(long energyAddingTime) {
		this.energyAddingTime = energyAddingTime;
	}
}
