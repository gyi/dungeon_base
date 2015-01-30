package com.base.data.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2014-7-21
 * @author : sunhua
 * @Description : 技能
 * @deprecated
 */
@Deprecated
public class Skill implements Serializable {
	private static final long serialVersionUID = -2416102747487379633L;
	/** 技能配置Id */
	private long skillTypeId;
	/** 技能等级 */
	private int level;

	public Skill() {
	}

	public Skill(long skillTypeId, int level) {
		this.skillTypeId = skillTypeId;
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public long getSkillTypeId() {
		return skillTypeId;
	}

	public void setSkillTypeId(long skillTypeId) {
		this.skillTypeId = skillTypeId;
	}
}
