package com.base.def.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2014-6-9
 * @author : wangl
 * @Description : 简略物品信息
 */
public class LessItem implements Serializable {
	private static final long serialVersionUID = 3790528926103745190L;
	private int itemId;// 道具id
	private int num;// 数量

	public LessItem() {
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LessItem) {
			return ((LessItem) obj).itemId == itemId;
		}
		return false;
	}

	public LessItem(int itemId, int num) {
		this.itemId = itemId;
		this.num = num;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
