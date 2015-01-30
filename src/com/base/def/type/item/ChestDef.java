package com.base.def.type.item;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.base.def.entity.DropItem;
import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-2
 * @author : sunhua
 * @Description : TODO
 */
@Describle("宝箱配置表")
public class ChestDef extends ItemDef {
	private static final long serialVersionUID = 7184093547149581217L;
	@Describle("是否自动开启")
	private boolean autOpen;
	@Describle("开启模式")
	private int modle;
	@Describle("开启次数")
	private int openCount;
	@Describle("职业-具体的道具")
	private Map<Integer, DropItem[]> dropItems;

	@Override
	public int getType() {
		return ItemType.CHEST_ITEM_VALUE;
	}

	@Override
	public String toString() {
		return getName() + "-" + getId();
	}

	public boolean isAutOpen() {
		return autOpen;
	}

	public void setAutOpen(boolean autOpen) {
		this.autOpen = autOpen;
	}

	public int getModle() {
		return modle;
	}

	public void setModle(int modle) {
		this.modle = modle;
	}

	public int getOpenCount() {
		return openCount;
	}

	public void setOpenCount(int openCount) {
		this.openCount = openCount;
	}

	public Map<Integer, DropItem[]> getDropItems() {
		return dropItems;
	}

	public void setDropItems(String dropItems) {
		this.dropItems = new HashMap<>();
		if (StringUtils.isEmpty(dropItems)) {
			return;
		}
		try {
			String[] careerItemStrings = dropItems.split(StringHelper.leve2split);
			for (int j = 0; j < careerItemStrings.length; j++) {
				String[] careerStrings = careerItemStrings[j].split(StringHelper.leve4split);
				int career = Integer.valueOf(careerStrings[0]);// 职业

				String[] dropItemStrings = careerStrings[1].split(StringHelper.leve1split);// 职业掉落
				DropItem[] careerDrops = new DropItem[dropItemStrings.length];
				for (int i = 0; i < dropItemStrings.length; i++) {
					int[] parameters = StringHelper.toIntArray(StringHelper.leve3split, dropItemStrings[i]);
					DropItem dropItem = new DropItem();
					dropItem.setItemId(parameters[0]);// 道具id
					dropItem.setNum(parameters[1]);// 道具数量
					if (parameters.length > 2) {
						dropItem.setRatio(parameters[2]);// 比例
					}
					careerDrops[i] = dropItem;
				}
				this.dropItems.put(career, careerDrops);
			}

		} catch (Exception e) {
			throw new RuntimeException("parse dropItem text: " + dropItems, e);
		}
	}

}
