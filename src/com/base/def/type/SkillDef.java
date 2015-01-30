package com.base.def.type;

import org.apache.commons.lang3.StringUtils;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.general.StringHelper;
import com.core.scope.ArcScope;
import com.core.scope.RectScope;
import com.core.scope.SkillScope;
import com.xe.annotation.Describle;

/**
 * @Create time : 2014-12-2
 * @author : zhuqd
 * @Description :
 */
@Describle("技能配置表")
public class SkillDef implements BaseDef<Integer> {

	private static final long serialVersionUID = -7806477433218020019L;

	@Describle("ID(命名规则@苏爽)")
	private int id;
	@Describle("技能等级")
	private int level;
	@Describle("名称")
	private String name;
	// @Describle("按键(A,B,C,D)(MsgDefineFight.SkillButton)")
	// private String button;
	@Describle("目标对象(MsgDefineFight.SKILL_TARGET_TYPE)")
	private int targetType;
	// @Describle("触发条件(触发表的ID)")
	// private int triggerId;
	@Describle("技能攻击范围(单体不填，圆(arc:半径,弧度)，矩形(rect:宽,高))单位(cm)")
	private SkillScope scope;
	@Describle("是否是被动技能")
	private boolean passive;
	@Describle("技能CD(ms)")
	private int cd;
	@Describle("伤害类型(1-物理,2-魔法)")
	private int damageType;
	@Describle("技能表现时间(AI维护使用)")
	private int useTime;
	@Describle("施放距离(cm)")
	private int distance;
	@Describle("buff(1003,1007)")
	private int[] buffIds;
	@Describle("技能段伤害(1003,1007)")
	private float[] segmentDamageRatio;
	// @Describle("动作ID")
	// private int actionId;

	/************* 各种消耗定义 ********************/
	@Describle("消耗类型(MsgDefineFight.SkillCostType)")
	private int costType;
	@Describle("消耗模式(当前,最大,固定,无)(MsgDefineFight.SkillCostPattern)")
	private int costPattarn;
	@Describle("消耗数值")
	private float costHit;

	/************* 怒气增加规则 ********************/
	@Describle("怒气：增加怒气数值")
	private int duryAddValue;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public DefType getDefType() {
		return DefType.SKILL;
	}

	// public double getDamageRatio() {
	// return damageRatio;
	// }
	//
	// public void setDamageRatio(double damageRatio) {
	// this.damageRatio = damageRatio;
	// }

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getBuffIds() {
		return buffIds;
	}

	public void setBuffIds(String bufIds) {
		if (bufIds != null && !bufIds.equals("0")) {
			this.buffIds = StringHelper.toIntArray(StringHelper.leve1split, bufIds);
		}
		if (this.buffIds == null) {
			this.buffIds = new int[0];
		}
	}

	public void setScope(String scopeStr) {
		if (StringUtils.isEmpty(scopeStr)) {
			return;// 单体，无需范围
		}
		String[] scopeStrs = scopeStr.split(StringHelper.leve4split);
		if (scopeStrs.length != 2) {
			throw new RuntimeException("error scope " + scopeStr);
		}
		String[] rectStrs = scopeStrs[1].split(StringHelper.leve1split);
		SkillScope skillScope = null;
		if ("arc".equals(scopeStrs[0])) {
			skillScope = new ArcScope(Integer.valueOf(rectStrs[0]), Integer.valueOf(rectStrs[1]));// 半径，角度
		} else if ("rect".equals(scopeStrs[0])) {
			skillScope = new RectScope(Integer.valueOf(rectStrs[0]), Integer.valueOf(rectStrs[1]));// 长、宽
		}
		this.scope = skillScope;
	}

	public SkillScope getScope() {
		return scope;
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

	public int getCostType() {
		return costType;
	}

	public void setCostType(int costType) {
		this.costType = costType;
	}

	public int getCostPattarn() {
		return costPattarn;
	}

	public void setCostPattarn(int costPattarn) {
		this.costPattarn = costPattarn;
	}

	public float getCostHit() {
		return costHit;
	}

	public void setCostHit(float costHit) {
		this.costHit = costHit;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public float[] getSegmentDamageRatio() {
		return segmentDamageRatio;
	}

	public void setSegmentDamageRatio(String segmentDamageRatioStr) {
		this.segmentDamageRatio = StringHelper.toFloatArray(StringHelper.leve1split, segmentDamageRatioStr);
		if (this.segmentDamageRatio == null) {
			this.segmentDamageRatio = new float[0];
		}
	}

	public boolean isPassive() {
		return passive;
	}

	public void setPassive(boolean passive) {
		this.passive = passive;
	}

	public int getUseTime() {
		return useTime;
	}

	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}

	public int getDamageType() {
		return damageType;
	}

	public void setDamageType(int damageType) {
		this.damageType = damageType;
	}

	public int getTargetType() {
		return targetType;
	}

	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}

	public int getDuryAddValue() {
		return duryAddValue;
	}

	public void setDuryAddValue(int duryAddValue) {
		this.duryAddValue = duryAddValue;
	}

	// public int getActionId() {
	// return actionId;
	// }
	//
	// public void setActionId(int actionId) {
	// this.actionId = actionId;
	// }

}
