package com.base.data.entity;

import java.io.Serializable;
import java.util.LinkedList;

/**
 * 
 * @Create time : 2014-9-17
 * @author : wangl
 * @Description : 家族信息
 */
public class Family implements Comparable<Family>, Serializable {
	private static final long serialVersionUID = -7097028917492032418L;

	private int id;// id
	private String name;// 昵称
	private int level;// 等级
	private int totalCredit;// 总贡献
	private long shaikhId;// 族长id
	private String notice;// 公告
	private LinkedList<Long> familyApplyList;// 家族申请列表
	private LinkedList<FamilyMember> members = new LinkedList<>();// 成员列表

	@Override
	public int compareTo(Family o) {
		return o.totalCredit - totalCredit;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("[").append(name).append(",").append(id).append(",").append(members.size()).append("]").toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

	public LinkedList<FamilyMember> getMembers() {
		return members;
	}

	public void setMembers(LinkedList<FamilyMember> members) {
		this.members = members;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public LinkedList<Long> getFamilyApplyList() {
		return familyApplyList;
	}

	public void setFamilyApplyList(LinkedList<Long> familyApplyList) {
		this.familyApplyList = familyApplyList;
	}

	public long getShaikhId() {
		return shaikhId;
	}

	public void setShaikhId(long shaikhId) {
		this.shaikhId = shaikhId;
	}

}
