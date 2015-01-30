package com.base.def.type.item;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-7-14
 * @author : wangl
 * @Description : 货币道具
 */
@Describle("金币道具配置表")
public class CurrencyItemDef extends ItemDef {
	private static final long serialVersionUID = 5415892397455624331L;

	@Override
	public int getType() {
		return ItemType.CURRENCY_ITEM_VALUE;
	}

}
