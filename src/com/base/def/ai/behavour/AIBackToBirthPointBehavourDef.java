package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-30
 * @author : sunhua
 * @Description : ai返回追击点
 */
@Describle("ai返回追击点")
public class AIBackToBirthPointBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 3399305027504614093L;

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_BACK_TO_FOLLOW_POINT;
	}

}
