package com.base.def.type.item.consume;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.xe.annotation.Describle;

/**
 * 技能书类
 * 
 * @Create time : 2015-1-14
 * @author : sunhua
 * @Description : TODO
 */
@Describle("技能书类道具")
public class SkillBookItemDef extends ItemDef {
	private static final long serialVersionUID = 6788807876936181557L;
	@Describle("使用类型1代表角色2代表宠物")
	private int type;
	@Describle("技能Id")
	private int skillId;

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int getType() {
		return ItemType.SKILL_BOOK_ITEM_VALUE;
	}

}
