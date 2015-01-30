package com.base.def.type.item.consume;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.xe.annotation.Describle;

/**
 * buffer类
 * 
 * @Create time : 2015-1-14
 * @author : sunhua
 * @Description : TODO
 */
@Describle("buffer类道具")
public class BufferItemDef extends ItemDef {
	private static final long serialVersionUID = -2448231261181374355L;
	@Describle("悬挂bufferId")
	private int bufferId;

	public int getBufferId() {
		return bufferId;
	}

	public void setBufferId(int bufferId) {
		this.bufferId = bufferId;
	}

	@Override
	public int getType() {
		return ItemType.BUFFER_ITEM_VALUE;
	}

}
