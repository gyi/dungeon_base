package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * @Create time : 2014-12-8
 * @author : zhuqd
 * @Description : 技能触发条件配置定义
 */
@Describle("技能触发条件配置表")
public class SkillTriggerDef implements BaseDef<Integer> {

	private static final long serialVersionUID = 898444783570949513L;

	@Describle("ID")
	private int id;
	@Describle("触发条件类型")
	private int triggerType;
	@Describle("条件百分比")
	private float pct;
	@Describle("最大触发次数")
	private int maxTime;

	@Override
	public Integer getId() {
		return this.id;
	}

	@Override
	public DefType getDefType() {
		return DefType.SKILL_TRIGGER;
	}

	public int getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(int triggerType) {
		this.triggerType = triggerType;
	}

	public float getPct() {
		return pct;
	}

	public void setPct(float pct) {
		this.pct = pct;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}

}
