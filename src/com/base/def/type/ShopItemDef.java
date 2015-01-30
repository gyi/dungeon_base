package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-2
 * @author : ZhangQiang
 * @Description : 商店配置表
 */
@Describle("商店配置表")
public class ShopItemDef implements BaseDef<Integer> {
	private static final long serialVersionUID = -1321700849033930253L;

	@Describle("商品id")
	private int shopItemId;
	@Describle("商店名称")
	private String shopName;
	@Describle("商店id")
	private int shopId;
	@Describle("道具id")
	private int itemId;
	@Describle("道具类型")
	private int itemType;
	@Describle("购买实际数量")
	private int buyNum;
	@Describle("商品的支付类型")
	private int payType;
	@Describle("商品购买需要的支付的道具数量")
	private int payNum;
	@Describle("商品的限购数量，（如果为0，则为不限购）")
	private int limteNum;
	@Describle("商品标签（如果为0，则此商品无标签）")
	private int label;

	@Override
	public Integer getId() {
		return shopItemId;
	}

	@Override
	public DefType getDefType() {
		return DefType.SHOPITEM;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
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

	public int getLimteNum() {
		return limteNum;
	}

	public void setLimteNum(int limteNum) {
		this.limteNum = limteNum;
	}

	public void setShopItemId(int shopItemId) {
		this.shopItemId = shopItemId;
	}

	public int getLabel() {
		return label;
	}

	public void setLabel(int label) {
		this.label = label;
	}

	public int getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(int buyNum) {
		this.buyNum = buyNum;
	}

}
