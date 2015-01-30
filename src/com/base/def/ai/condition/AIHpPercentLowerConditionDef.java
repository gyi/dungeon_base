package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-11
 * @author : sunhua
 * @Description : 低于血量百分比条件(心跳)
 */
@Describle("ai血量百分比低于指定值条件")
public class AIHpPercentLowerConditionDef extends AIConditionDef {
	private static final long serialVersionUID = 8267391133624322827L;
	@Describle("血量百分比条件")
	private float hpPercent;

	public float getHpPercent() {
		return hpPercent;
	}

	public void setHpPercent(float hpPercent) {
		this.hpPercent = hpPercent;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.HP_LOWER;
	}

}
