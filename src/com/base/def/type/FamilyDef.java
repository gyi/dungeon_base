package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-9-18
 * @author : ZhangQiang
 * @Description : 家族配置表
 */
@Describle("家族配置表")
public class FamilyDef implements BaseDef<Integer> {
	private static final long serialVersionUID = 3723939968792127816L;
	@Describle("家族等级")
	private int Id;
	@Describle("升级所需的贡献值,为0则不可升级")
	private int needTotalCredit;
	@Describle("可容纳的家族人数")
	private int memberNum;
	@Describle("家族特权FamilyPrerogative")
	private int[] prerogative;
	@Describle("家族申请列表人数")
	private int applyMemberNum;

	@Override
	public Integer getId() {
		return Id;
	}

	@Override
	public DefType getDefType() {
		return DefType.FAMILY;
	}

	public int getNeedTotalCredit() {
		return needTotalCredit;
	}

	public void setNeedTotalCredit(int needTotalCredit) {
		this.needTotalCredit = needTotalCredit;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public int[] getPrerogative() {
		return prerogative;
	}

	public void setPrerogative(int[] prerogative) {
		this.prerogative = prerogative;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getApplyMemberNum() {
		return applyMemberNum;
	}

	public void setApplyMemberNum(int applyMemberNum) {
		this.applyMemberNum = applyMemberNum;
	}

}
