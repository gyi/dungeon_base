package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-19
 * @author : sunhua
 * @Description : ai有目标
 */
@Describle("ai有目标条件")
public class AIHaveTargetConditionDef extends AIConditionDef {
	private static final long serialVersionUID = 6371943033476587500L;

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.HAVE_TARGET;
	}

}
