package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

@Describle("AI到达追击点坐标")
public class AIToBirthPointConditionDef extends AIConditionDef {
	private static final long serialVersionUID = 4156853085235075132L;

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.TO_FOLLOW_POINT;
	}

}
