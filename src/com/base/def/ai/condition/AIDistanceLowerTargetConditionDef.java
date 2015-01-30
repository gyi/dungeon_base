package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-11
 * @author : sunhua
 * @Description : 低于指定距离条件(心跳)
 */
@Describle("ai与目标距离低于指定值条件 ")
public class AIDistanceLowerTargetConditionDef extends AIConditionDef {
	private static final long serialVersionUID = -5098160806171671493L;
	@Describle("与目标距离条件")
	private int dis;

	public int getDis() {
		return dis;
	}

	public void setDis(int dis) {
		this.dis = dis;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.DISTANCE_LOWER;
	}
}
