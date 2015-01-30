package com.base.data.entity;

import com.core.general.RatioHelper.Ratio;

public class SkillRatio implements Ratio {
	private static final long serialVersionUID = 2956650451196395787L;
	private int skillId;
	private int power;

	public SkillRatio(int skillId, int power) {
		this.skillId = skillId;
		this.power = power;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int getRatio() {
		return power;
	}

}
