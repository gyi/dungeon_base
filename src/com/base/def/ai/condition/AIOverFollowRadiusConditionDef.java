package com.base.def.ai.condition;

import com.base.def.ai.AIConditionDef;
import com.base.pb.MsgDefineMap.AIConditionType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-29
 * @author : sunhua
 * @Description : ai超出追击半径检测条件
 */
@Describle("超出追击半径")
public class AIOverFollowRadiusConditionDef extends AIConditionDef {
	private static final long serialVersionUID = -4327688053557639887L;
	@Describle("追击半径")
	private int followRadius;

	public int getFollowRadius() {
		return followRadius;
	}

	public void setFollowRadius(int followRadius) {
		this.followRadius = followRadius;
	}

	@Override
	public AIConditionType getAIConditionType() {
		return AIConditionType.OVER_FOLLOW_RADIUS;
	}

}
