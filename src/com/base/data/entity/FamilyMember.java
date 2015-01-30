package com.base.data.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2014-9-17
 * @author : wangl
 * @Description : 家族成员
 */
public class FamilyMember implements Comparable<FamilyMember>, Serializable {
	private static final long serialVersionUID = 3585282982173844868L;

	private long roleId;// 角色id
	private int roleType;// 职位
	private int credit;// 贡献
	private int totalCredit;// 总贡献

	@Override
	public int compareTo(FamilyMember o) {
		if (this.roleType != o.roleType) {
			return this.roleType - o.roleType;
		}
		return o.totalCredit - this.totalCredit;
	}

	@Override
	public String toString() {
		return "id: " + roleId + ", role: " + roleType;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

}
