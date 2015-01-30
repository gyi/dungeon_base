package com.base.data.module;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.base.data.ModuleData;
import com.base.data.ModuleType;

/**
 * 
 * @Create time : 2014-7-14
 * @author : yezhi
 * @Description : 社交信息
 */
public class SocialData extends ModuleData {

	private static final long serialVersionUID = -4809354172647634367L;

	private List<Long> friendSocial = new ArrayList<Long>();// 好友列表
	private LinkedList<Long> enemySocial = new LinkedList<Long>();// 仇人列表
	private List<Long> blackSocial = new ArrayList<Long>();// 黑名单列表
	private long familyExitTime;// 离开家族的时间

	@Override
	public ModuleType moduleType() {
		return ModuleType.social;
	}

	public List<Long> getFriendSocial() {
		return friendSocial;
	}

	public void setFriendSocial(List<Long> friendSocial) {
		this.friendSocial = friendSocial;
	}

	public LinkedList<Long> getEnemySocial() {
		return enemySocial;
	}

	public void setEnemySocial(LinkedList<Long> enemySocial) {
		this.enemySocial = enemySocial;
	}

	public List<Long> getBlackSocial() {
		return blackSocial;
	}

	public void setBlackSocial(List<Long> blackSocial) {
		this.blackSocial = blackSocial;
	}

	public long getFamilyExitTime() {
		return familyExitTime;
	}

	public void setFamilyExitTime(long familyExitTime) {
		this.familyExitTime = familyExitTime;
	}

}
