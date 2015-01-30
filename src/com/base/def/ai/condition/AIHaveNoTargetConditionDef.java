package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-19
 * @author : sunhua
 * @Description : ai当前没有攻击目标
 */
@Describle("ai没有目标条件")
public class AIHaveNoTargetConditionDef extends AIConditionDef {
	private static final long serialVersionUID = -922151165795470833L;

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.HAVE_NO_TARGET;
	}

}
