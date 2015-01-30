package com.base.data.entity;

import java.io.Serializable;

/**
 * 
 * @Create time : 2015-1-16
 * @author : zhangqiang
 * @Description : 神秘商店信息
 */
public class MysteryShopItem implements Serializable {

	private static final long serialVersionUID = -1736317880891336212L;
	private int id;// 商店Id
	private int itemId;// 道具Id
	private int buyNum;// 道具数量
	private int payType;// 支付类型
	private int payNum;// 支付数量
	private boolean soldout;// 是否为磬售

	public MysteryShopItem() {
	}

	public MysteryShopItem(int id, int itemId, int buyNum, int payType, int payNum) {
		this.id = id;
		this.itemId = itemId;
		this.buyNum = buyNum;
		this.payType = payType;
		this.payNum = payNum;
	}

	public MysteryShopItem(int id, int itemId, int buyNum, int payType, int payNum, boolean soldout) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.buyNum = buyNum;
		this.payType = payType;
		this.payNum = payNum;
		this.soldout = soldout;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}

	public int getPayType() {
		return payType;
	}

	public void setPayType(int payType) {
		this.payType = payType;
	}

	public int getPayNum() {
		return payNum;
	}

	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}

	public boolean isSoldout() {
		return soldout;
	}

	public void setSoldout(boolean soldout) {
		this.soldout = soldout;
	}

}
