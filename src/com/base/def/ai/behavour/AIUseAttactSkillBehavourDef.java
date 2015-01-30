package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * ai使用攻击技能行为配置
 * 
 * @Create time : 2014-12-15
 * @author : sunhua
 * @Description : ai使用攻击技能行为配置
 */
@Describle("ai使用攻击技能")
public class AIUseAttactSkillBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = -7252586067407370779L;

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_USE_ATTACT_SKILL;
	}

}
