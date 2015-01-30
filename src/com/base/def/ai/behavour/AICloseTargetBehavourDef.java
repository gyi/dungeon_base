package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * ai靠近目标行为
 * 
 * @Create time : 2014-12-23
 * @author : sunhua
 * @Description : TODO
 */
@Describle("ai靠近目标 ")
public class AICloseTargetBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 8174847141138884378L;
	@Describle("靠近到距离目标的x距离")
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_CLOSE_TARGET_BEHAVOUR;
	}

}
