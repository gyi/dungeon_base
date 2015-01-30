package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * @Create time : 2014-11-28
 * @author : zhuqd
 * @Description :
 */
@Describle("Buff配置表")
public class BuffDef implements BaseDef<Integer> {

	private static final long serialVersionUID = 5711456566365387761L;

	@Describle("buffId")
	private int id;
	@Describle("类型(BuffType.BuffType)")
	private int type;
	@Describle("目标对象(MsgDefineFight.SKILL_TARGET_TYPE)")
	private int targetType;
	@Describle("持续时间")
	private int duration;
	@Describle("生效间隔时间(0:一直生效)(单位:ms)")
	private int interval;
	@Describle("固定效果值(0:没有固定效果)")
	private int fixedHit;
	@Describle("效果系数(0:没有系数加成)")
	private float ratio;
	@Describle("伤害类型(0,无，1：物理，2：魔法)")
	private int damageType;
	@Describle("是否需要广播")
	private boolean broadcast;
	@Describle("动作")
	private String actionName;
	@Describle("特效")
	private String effectName;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public DefType getDefType() {
		return DefType.BUFF;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getTargetType() {
		return targetType;
	}

	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getFixedHit() {
		return fixedHit;
	}

	public void setFixedHit(int fixedHit) {
		this.fixedHit = fixedHit;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getRatio() {
		return ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

	public boolean isBroadcast() {
		return broadcast;
	}

	public void setBroadcast(boolean broadcast) {
		this.broadcast = broadcast;
	}

	public int getDamageType() {
		return damageType;
	}

	public void setDamageType(int damageType) {
		this.damageType = damageType;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getEffectName() {
		return effectName;
	}

	public void setEffectName(String effectName) {
		this.effectName = effectName;
	}

}
