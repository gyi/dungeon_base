package com.base.def.type.item.consume;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.xe.annotation.Describle;

/**
 * 消耗类
 * 
 * @Create time : 2015-1-14
 * @author : sunhua
 * @Description : TODO
 */
@Describle("消耗类道具")
public class ConsumeItemDef extends ItemDef {
	private static final long serialVersionUID = -6742504453555742020L;
	@Describle("影响类型ReflectType")
	private int type;
	@Describle("影响值")
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int getType() {
		return ItemType.CONSUME_ITEM_VALUE;
	}

}
