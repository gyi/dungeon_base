package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-5-28
 * @author : wangl
 * @Description : 等级配置表
 */
@Describle("等级配置表")
public class LevelDef implements BaseDef<Integer> {
	private static final long serialVersionUID = -4715818009834813718L;
	@Describle("等级")
	private int level;
	@Describle("升级经验，为0表示不能升级")
	private int upExp;

	@Override
	public Integer getId() {
		return level;
	}

	@Override
	public DefType getDefType() {
		return DefType.LEVLE;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getUpExp() {
		return upExp;
	}

	public void setUpExp(int upExp) {
		this.upExp = upExp;
	}

}
