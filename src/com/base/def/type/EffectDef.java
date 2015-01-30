package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.scope.SkillScope;
import com.xe.annotation.Describle;

/**
 * @Create time : 2014-12-1
 * @author : zhuqd
 * @Description :
 * @deprecated
 */
@Deprecated
@Describle("Effect配置表")
public class EffectDef implements BaseDef<Integer> {

	private static final long serialVersionUID = -1952226303676402975L;

	@Describle("id")
	private int id;
	@Describle("类型(MsgDefineFight.EffectType)")
	private int type;
	@Describle("目标对象(MsgDefineFight.SKILL_TARGET_TYPE)")
	private int targetType;
	@Describle("技能攻击范围(单体不填，圆(arc:半径,弧度)，矩形(rect:宽,高))单位(cm)")
	private SkillScope scope;
	@Describle("伤害系数")
	private float damageRatio;
	@Describle("生效持续时间(ms)")
	private int effectTime;
	@Describle("造成位移距离(击飞,击退...)单位(cm)")
	private int effectDistance;
	@Describle("移动速度(子弹类型参数)")
	private int speed;
	@Describle("动作")
	private String actionName;
	@Describle("特效")
	private String effectName;

	@Override
	public Integer getId() {
		return null;
	}

	@Override
	public DefType getDefType() {
		return DefType.SKILL_EFFECT;
	}

	public void setId(int id) {
		this.id = id;
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

	public SkillScope getScope() {
		return scope;
	}

	public void setScope(SkillScope scope) {
		this.scope = scope;
	}

	public int getEffectTime() {
		return effectTime;
	}

	public void setEffectTime(int effectTime) {
		this.effectTime = effectTime;
	}

	public int getEffectDistance() {
		return effectDistance;
	}

	public void setEffectDistance(int effectDistance) {
		this.effectDistance = effectDistance;
	}

	public String getEffectName() {
		return effectName;
	}

	public void setEffectName(String effectName) {
		this.effectName = effectName;
	}

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getDamageRatio() {
		return damageRatio;
	}

	public void setDamageRatio(float damageRatio) {
		this.damageRatio = damageRatio;
	}

}
