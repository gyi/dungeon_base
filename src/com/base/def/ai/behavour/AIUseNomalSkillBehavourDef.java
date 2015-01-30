package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-15
 * @author : sunhua
 * @Description : ai使用特殊技能行为
 */
@Describle("ai使用普通技能")
public class AIUseNomalSkillBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = -646398422103364877L;

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_USE_NOMAL_SKILL;
	}

}
