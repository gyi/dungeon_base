package com.base.def.ai;

import java.io.Serializable;

import com.base.pb.MsgDefineMap.AIBehavourType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-11
 * @author : sunhua
 * @Description : ai行为配置参数表
 */
@Describle("ai行为配置参数表")
public abstract class AIBehavourDef implements Serializable {
	private static final long serialVersionUID = -4239967081720792558L;
	@Describle("进入行为的条件")
	protected AIConditionDef enterCondition;
	@Describle("退出行为的条件")
	protected AIConditionDef outerCondition;
	@Describle("该行为的cd时间")
	protected long CD;
	@Describle("行为优先级")
	protected int level;
	@Describle("执行次数")
	protected int count;
	@Describle("能否被打断")
	protected boolean canBeBroken;

	public AIConditionDef getEnterCondition() {
		return enterCondition;
	}

	public void setEnterCondition(AIConditionDef enterCondition) {
		this.enterCondition = enterCondition;
	}

	public AIConditionDef getOuterCondition() {
		return outerCondition;
	}

	public void setOuterCondition(AIConditionDef outerCondition) {
		this.outerCondition = outerCondition;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public long getCD() {
		return CD;
	}

	public void setCD(long cD) {
		CD = cD;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isCanBeBroken() {
		return canBeBroken;
	}

	public void setCanBeBroken(boolean canBeBroken) {
		this.canBeBroken = canBeBroken;
	}

	public abstract AIBehavourType getType();
}
