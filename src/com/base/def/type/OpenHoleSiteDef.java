package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-5
 * @author : yezhi
 * @Description : 孔位开启配置表
 */
@Describle("孔位开启配置表")
public class OpenHoleSiteDef implements BaseDef<String> {

	private static final long serialVersionUID = -2112177952633798556L;
	@Describle("部位")
	private int part;
	@Describle("栏位")
	private int holeSite;
	@Describle("开启等级")
	private int level;
	@Describle("需要的元宝")
	private int sycee;

	@Override
	public String getId() {
		return StringHelper.buildKey(part, holeSite);
	}

	@Override
	public DefType getDefType() {
		return DefType.OPENHOLESITE;
	}

	public void setPart(int part) {
		this.part = part;
	}

	public int getHoleSite() {
		return holeSite;
	}

	public void setHoleSite(int holeSite) {
		this.holeSite = holeSite;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSycee() {
		return sycee;
	}

	public void setSycee(int sycee) {
		this.sycee = sycee;
	}
}
