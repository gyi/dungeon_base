package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-5-28
 * @author : wangl
 * @Description : 职业配置表
 */
@Describle("职业配置表")
public class CareerDef implements BaseDef<String> {
	private static final long serialVersionUID = -769452335850064218L;
	// 一级属性
	@Describle("职业类型")
	private int career;
	@Describle("等级")
	private int level;
	@Describle("血量")
	private int hp;
	@Describle("魔法值")
	private int mp;
	@Describle("怒气")
	private int fury;
	@Describle("物理攻击力")
	private int physicalAtt;
	@Describle("物理防御力")
	private int physicalDef;
	@Describle("魔法攻击力")
	private int mageAtt;
	@Describle("魔法防御力")
	private int magicDef;
	@Describle("破击")
	private int sunder;
	@Describle("抵抗值")
	private int sunderDef;
	@Describle("暴击")
	private int crit;
	@Describle("韧性值")
	private int critDef;

	// 二级属性
	@Describle("生命回复")
	private int hpRegen;
	@Describle("破击百分比")
	private int sunderPCT;
	@Describle("抵抗百分比")
	private int sunderDefPCT;
	@Describle("暴击百分比")
	private int critPCT;
	@Describle("韧性百分比")
	private int critDefPCT;
	@Describle("物伤百分比")
	private int physicalAttPCT;
	@Describle("物免百分比")
	private int physicalImmunePCT;
	@Describle("魔伤百分比")
	private int magicAttPCT;
	@Describle("魔免百分比")
	private int magicImmunePCT;
	@Describle("抵抗免伤百分比")
	private int sunderDefImmunePCT;
	@Describle("暴伤百分比")
	private int critAttPCT;

	@Describle("奔跑速度")
	private int runSpeed;
	@Describle("移速A")
	private int speedA;
	@Describle("移速B")
	private int speedB;

	@Describle("角色伤害系数")
	private double damageRatio;
	@Describle("怒气：受到伤害比例")
	private float furyBeHitRatio;
	@Describle("怒气：增加怒气数值")
	private int furyAddValue;

	@Override
	public String getId() {
		return StringHelper.buildKey(career, level);
	}

	@Override
	public DefType getDefType() {
		return DefType.CAREER;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getFury() {
		return fury;
	}

	public void setFury(int fury) {
		this.fury = fury;
	}

	public int getPhysicalAtt() {
		return physicalAtt;
	}

	public void setPhysicalAtt(int physicalAtt) {
		this.physicalAtt = physicalAtt;
	}

	public int getPhysicalDef() {
		return physicalDef;
	}

	public void setPhysicalDef(int physicalDef) {
		this.physicalDef = physicalDef;
	}

	public int getMageAtt() {
		return mageAtt;
	}

	public void setMageAtt(int mageAtt) {
		this.mageAtt = mageAtt;
	}

	public int getMagicDef() {
		return magicDef;
	}

	public void setMagicDef(int magicDef) {
		this.magicDef = magicDef;
	}

	public int getSunder() {
		return sunder;
	}

	public void setSunder(int sunder) {
		this.sunder = sunder;
	}

	public int getSunderDef() {
		return sunderDef;
	}

	public void setSunderDef(int sunderDef) {
		this.sunderDef = sunderDef;
	}

	public int getCrit() {
		return crit;
	}

	public void setCrit(int crit) {
		this.crit = crit;
	}

	public int getCritDef() {
		return critDef;
	}

	public void setCritDef(int critDef) {
		this.critDef = critDef;
	}

	public int getHpRegen() {
		return hpRegen;
	}

	public void setHpRegen(int hpRegen) {
		this.hpRegen = hpRegen;
	}

	public int getSunderPCT() {
		return sunderPCT;
	}

	public void setSunderPCT(int sunderPCT) {
		this.sunderPCT = sunderPCT;
	}

	public int getSunderDefPCT() {
		return sunderDefPCT;
	}

	public void setSunderDefPCT(int sunderDefPCT) {
		this.sunderDefPCT = sunderDefPCT;
	}

	public int getCritPCT() {
		return critPCT;
	}

	public void setCritPCT(int critPCT) {
		this.critPCT = critPCT;
	}

	public int getCritDefPCT() {
		return critDefPCT;
	}

	public void setCritDefPCT(int critDefPCT) {
		this.critDefPCT = critDefPCT;
	}

	public int getPhysicalAttPCT() {
		return physicalAttPCT;
	}

	public void setPhysicalAttPCT(int physicalAttPCT) {
		this.physicalAttPCT = physicalAttPCT;
	}

	public int getPhysicalImmunePCT() {
		return physicalImmunePCT;
	}

	public void setPhysicalImmunePCT(int physicalImmunePCT) {
		this.physicalImmunePCT = physicalImmunePCT;
	}

	public int getMagicAttPCT() {
		return magicAttPCT;
	}

	public void setMagicAttPCT(int magicAttPCT) {
		this.magicAttPCT = magicAttPCT;
	}

	public int getMagicImmunePCT() {
		return magicImmunePCT;
	}

	public void setMagicImmunePCT(int magicImmunePCT) {
		this.magicImmunePCT = magicImmunePCT;
	}

	public int getSunderDefImmunePCT() {
		return sunderDefImmunePCT;
	}

	public void setSunderDefImmunePCT(int sunderDefImmunePCT) {
		this.sunderDefImmunePCT = sunderDefImmunePCT;
	}

	public int getCritAttPCT() {
		return critAttPCT;
	}

	public void setCritAttPCT(int critAttPCT) {
		this.critAttPCT = critAttPCT;
	}

	public int getRunSpeed() {
		return runSpeed;
	}

	public void setRunSpeed(int runSpeed) {
		this.runSpeed = runSpeed;
	}

	public int getSpeedA() {
		return speedA;
	}

	public void setSpeedA(int speedA) {
		this.speedA = speedA;
	}

	public int getSpeedB() {
		return speedB;
	}

	public void setSpeedB(int speedB) {
		this.speedB = speedB;
	}

	public double getDamageRatio() {
		return damageRatio;
	}

	public void setDamageRatio(double damageRatio) {
		this.damageRatio = damageRatio;
	}

	public float getFuryBeHitRatio() {
		return furyBeHitRatio;
	}

	public void setFuryBeHitRatio(float furyBeHitRatio) {
		this.furyBeHitRatio = furyBeHitRatio;
	}

	public int getFuryAddValue() {
		return furyAddValue;
	}

	public void setFuryAddValue(int furyAddValue) {
		this.furyAddValue = furyAddValue;
	}

}
