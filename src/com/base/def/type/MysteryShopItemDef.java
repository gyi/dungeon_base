package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.core.general.RatioHelper.Ratio;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-14
 * @author : zhangqiang
 * @Description : 神秘商店配置表
 */
@Describle("神秘商店配置表")
public class MysteryShopItemDef implements BaseDef<Integer>, Ratio {
	private static final long serialVersionUID = -3122586341871634360L;

	@Describle("商品id")
	private int id;
	@Describle("道具id")
	private int itemId;
	@Describle("商店id")
	private int shopId;
	@Describle("购买实际数量")
	private int buyNum;
	@Describle("商品的支付类型")
	private int payType;
	@Describle("商品购买需要的支付的道具数量")
	private int payNum;
	@Describle("商品权重")
	private int weight;

	@Override
	public int getRatio() {
		return weight;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public DefType getDefType() {
		return DefType.MYSTACALSHOPITEM;
	}

	@Override
	public String toString() {
		return new StringBuffer().append("shopId: ").append(id).toString();
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

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

}
