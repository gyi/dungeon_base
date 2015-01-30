package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * ai周围有敌人条件
 * 
 * @Create time : 2014-12-15
 * @author : sunhua
 * @Description : ai周围有敌人条件(心跳)
 */
@Describle("ai周围有敌人条件")
public class AIAroundHaveEnemyConditionDef extends AIConditionDef {
	private static final long serialVersionUID = 5627426011918316182L;
	@Describle("视野半径")
	private int viewRadius;

	public int getViewRadius() {
		return viewRadius;
	}

	public void setViewRadius(int viewRadius) {
		this.viewRadius = viewRadius;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.AROUND_HAVE_ENEMY;
	}

}
