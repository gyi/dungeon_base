package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-15
 * @author : sunhua
 * @Description : ai使用防御技能
 */
@Describle("ai使用防御技能")
public class AIUseDefendSkillBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 3323452406536503756L;

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_USE_DEFEND_SKILL;
	}

}
