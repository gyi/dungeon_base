package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-13
 * @author : sunhua
 * @Description : ai追击目标
 */
@Describle("ai追击目标")
public class AIFollowTargetBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 2113380107971072681L;

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_FOLLOW_TARGET_BEHAVOUR;
	}

}
