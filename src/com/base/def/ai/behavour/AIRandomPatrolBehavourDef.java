package com.base.def.ai.behavour;

import com.base.def.ai.AIBehavourDef;
import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * @Create time : 2014-12-12
 * @author : sunhua
 * @Description : ai随机游走行为
 */
@Describle("ai随机游走")
public class AIRandomPatrolBehavourDef extends AIBehavourDef {
	private static final long serialVersionUID = 7993057157195697949L;
	@Describle("游走半径")
	private int partrolRadis;
	@Describle("游荡几率(分母10000)")
	private int patrolOdds;

	public int getPartrolRadis() {
		return partrolRadis;
	}

	public void setPartrolRadis(int partrolRadis) {
		this.partrolRadis = partrolRadis;
	}

	public int getPatrolOdds() {
		return patrolOdds;
	}

	public void setPatrolOdds(int patrolOdds) {
		this.patrolOdds = patrolOdds;
	}

	@Override
	public AIBehavourType getType() {
		return AIBehavourType.AI_RANDOM_PATROL_BEHAVOUR;
	}

}
