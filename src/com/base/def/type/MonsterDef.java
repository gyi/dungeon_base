package com.base.def.type;

import java.util.ArrayList;
import java.util.List;

import com.base.data.entity.SkillRatio;
import com.base.def.DefType;
import com.base.def.type.abs.FightDef;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-6-13
 * @author : wangl
 * @Description : 战斗属性配置表
 */
@Describle("怪物配置表")
public class MonsterDef extends FightDef {
	private static final long serialVersionUID = -5005184205308606749L;
	@Describle("ai攻击技能配置(技能id:概率(分母为10000))")
	private List<SkillRatio> attactAiSkills;
	@Describle("ai防御技能配置(技能id:概率(分母为10000))")
	private List<SkillRatio> defendAiSkills;
	@Describle("ai特殊技能配置(技能id:概率(分母为10000))")
	private List<SkillRatio> nomalAiSkills;
	@Describle("掉落")
	private int dropId;

	@Override
	public DefType getDefType() {
		return DefType.MONSTER;
	}

	public List<SkillRatio> getAttactAiSkills() {
		return attactAiSkills;
	}

	public void setAttactAiSkills(String attactAiSkills) {
		if (attactAiSkills == null || "".equals(attactAiSkills)) {
			return;
		}
		this.attactAiSkills = new ArrayList<>();
		String[] skillRatios = attactAiSkills.split(";");
		for (String str : skillRatios) {
			int skillId = Integer.parseInt(str.split(":")[0]);
			int power = Integer.parseInt(str.split(":")[1]);
			this.attactAiSkills.add(new SkillRatio(skillId, power));
		}
	}

	public List<SkillRatio> getDefendAiSkills() {
		return defendAiSkills;
	}

	public void setDefendAiSkills(List<SkillRatio> defendAiSkills) {
		this.defendAiSkills = defendAiSkills;
	}

	public List<SkillRatio> getNomalAiSkills() {
		return nomalAiSkills;
	}

	public void setNomalAiSkills(List<SkillRatio> nomalAiSkills) {
		this.nomalAiSkills = nomalAiSkills;
	}

	public int getDropId() {
		return dropId;
	}

	public void setDropId(int dropId) {
		this.dropId = dropId;
	}

}
