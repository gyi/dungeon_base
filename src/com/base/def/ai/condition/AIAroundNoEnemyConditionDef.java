package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-15
 * @author : sunhua
 * @Description : ai周围没有敌人条件(心跳)
 */
@Describle("ai周围没有敌人条件")
public class AIAroundNoEnemyConditionDef extends AIConditionDef {
	private static final long serialVersionUID = 3080502936415425552L;
	@Describle("视野半径")
	private int viewRadius;

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.AROUND_NO_ENEMY;
	}

	public int getViewRadius() {
		return viewRadius;
	}

	public void setViewRadius(int viewRadius) {
		this.viewRadius = viewRadius;
	}

}
