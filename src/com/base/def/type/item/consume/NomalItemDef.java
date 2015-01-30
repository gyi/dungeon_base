package com.base.def.type.item.consume;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.xe.annotation.Describle;

/**
 * 普通类道具
 * 
 * @Create time : 2015-1-14
 * @author : sunhua
 * @Description : TODO
 */
@Describle("普通类道具")
public class NomalItemDef extends ItemDef {
	private static final long serialVersionUID = -3028605435927997901L;

	@Override
	public int getType() {
		return ItemType.NOMAL_ITEM_VALUE;
	}

}
