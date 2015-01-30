package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-13
 * @author : sunhua
 * @Description : ai逃跑
 */
@Describle("ai逃跑行为")
public class AIRunawayBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 8589991963946118936L;
	@Describle("逃跑持续时间")
	private long time;
	@Describle("第一次向后移动的距离最小值")
	private int x_min;
	@Describle("第一次向后移动的距离最大值")
	private int x_max;
	@Describle("之后的随机半径")
	private int randRadius;

	public long getTime() {
		return time;
	}

	public int getX_min() {
		return x_min;
	}

	public void setX_min(int x_min) {
		this.x_min = x_min;
	}

	public int getX_max() {
		return x_max;
	}

	public void setX_max(int x_max) {
		this.x_max = x_max;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getRandRadius() {
		return randRadius;
	}

	public void setRandRadius(int randRadius) {
		this.randRadius = randRadius;
	}

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_RUN_AWAY_BEHAVOUR;
	}

}
