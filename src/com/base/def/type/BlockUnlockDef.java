package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-9-11
 * @author : zhaowei
 * @Description : TODO 解锁栏位配置表
 */
@Describle("解锁栏位配置表")
public class BlockUnlockDef implements BaseDef<Integer> {

	private static final long serialVersionUID = 3602215647738321639L;
	@Describle("格子数量")
	private int blockNum;

	@Describle("货币种类")
	private int currencyType;

	@Describle("消耗的物品配置id")
	private int itemDefId;

	@Describle("对应消耗的物品数量")
	private int itemNum;

	@Describle("货币数量")
	private int currencyValue;

	@Override
	public Integer getId() {
		return blockNum;
	}

	@Override
	public DefType getDefType() {
		return DefType.BackGoldCell;
	}

	public int getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(int currencyType) {
		this.currencyType = currencyType;
	}

	public int getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(int currencyValue) {
		this.currencyValue = currencyValue;
	}

	public int getBlockNum() {
		return blockNum;
	}

	public void setBlockNum(int blockNum) {
		this.blockNum = blockNum;
	}

	public int getItemDefId() {
		return itemDefId;
	}

	public void setItemDefId(int itemDefId) {
		this.itemDefId = itemDefId;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}
}
