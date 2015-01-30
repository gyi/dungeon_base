package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-9-26
 * @author : ZhangQiang
 * @Description : 家族权限配置表
 */
@Describle("家族权限配置表")
public class FamilyRoleJurisDef implements BaseDef<Integer> {

	private static final long serialVersionUID = 5255391911511952940L;
	@Describle("家族职位")
	private int familyRoleId;
	@Describle("玩家权利FamilyRights")
	private int[] roleRight;
	@Describle("人数上限")
	private int num;

	@Override
	public Integer getId() {
		return familyRoleId;
	}

	@Override
	public DefType getDefType() {
		return DefType.FAMILYPOWER;
	}

	public int getFamilyRoleId() {
		return familyRoleId;
	}

	public void setFamilyRoleId(int familyRoleId) {
		this.familyRoleId = familyRoleId;
	}

	public int[] getRoleRight() {
		return roleRight;
	}

	public void setRoleRight(int[] roleRight) {
		this.roleRight = roleRight;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
