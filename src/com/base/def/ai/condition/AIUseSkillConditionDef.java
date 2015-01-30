package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-13
 * @author : sunhua
 * @Description : 使用特定技能条件(触发)
 */
@Describle("ai使用特定技能条件")
public class AIUseSkillConditionDef extends AIConditionDef {
	private static final long serialVersionUID = -694599510788005947L;
	@Describle("使用某个指定技能")
	private long skillId;

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.SKILL_USE;
	}

}
