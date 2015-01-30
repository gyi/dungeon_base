package com.base.dispersed;

import java.util.ArrayList;
import java.util.List;

import com.base.data.module.BasicData;
import com.base.data.module.MapData;
import com.base.data.module.PropertyData;

/**
 * 
 * @Create time : 2014-7-7
 * @author : wangl
 * @Description : 简略记录角色的信息
 */
public class BriefRole {
	private long playerId;// 玩家id
	private long roleId;// 角色id
	private String nickName;// 角色昵称
	private boolean isDelete;// 是否已删除
	private int level;// 等级
	private int career;// 职业
	private int vip;// vip等级
	private int townId;// 所在城镇
	private long loginTime;// 登陆时间
	private long offlineTime;// 最后离线的时间
	private int familyId;// 角色所在家族
	private List<Integer> familyApplyList = new ArrayList<>();// 角色的家族申请列表

	public static BriefRole valueOf(BasicData basicData, PropertyData propertyData, MapData mapData) {
		BriefRole briefRole = new BriefRole();
		briefRole.roleId = basicData.getRoleId();
		briefRole.playerId = basicData.getPlayerId();
		briefRole.nickName = basicData.getNickName();
		briefRole.offlineTime = basicData.getOfflineTime();

		briefRole.level = propertyData.getLevel();
		briefRole.career = propertyData.getCareer();

		briefRole.townId = mapData.getTownId();
		return briefRole;
	}

	@Override
	public String toString() {
		return "[" + nickName + ", " + roleId + "]";
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getTownId() {
		return townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}

	public long getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}

	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public int getVip() {
		return vip;
	}

	public void setVip(int vip) {
		this.vip = vip;
	}

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public List<Integer> getFamilyApplyList() {
		return familyApplyList;
	}

	public void setFamilyApplyList(List<Integer> familyApplyList) {
		this.familyApplyList = familyApplyList;
	}

	public long getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(long offlineTime) {
		this.offlineTime = offlineTime;
	}

}
