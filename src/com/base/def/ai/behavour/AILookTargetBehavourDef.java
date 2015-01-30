package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-12
 * @author : sunhua
 * @Description : 检索目标
 */
@Describle("ai检索目标")
public class AILookTargetBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 8177761781397593629L;
	@Describle("视野半径")
	private int viewRadius;

	public int getViewRadius() {
		return viewRadius;
	}

	public void setViewRadius(int viewRadius) {
		this.viewRadius = viewRadius;
	}

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_LOOK_TARGET_BEHAVOUR;
	}

}
