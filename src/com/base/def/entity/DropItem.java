package com.base.def.entity;

import com.core.general.RatioHelper.Ratio;

/**
 * 
 * @Create time : 2014-6-6
 * @author : wangl
 * @Description : 掉落信息包装
 */
public class DropItem implements Ratio {
	private static final long serialVersionUID = -2322603775785166403L;
	private int itemId;// 道具id
	private int num;// 数量
	private int ratio;// 比例，如果为0，表示必得

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

}
