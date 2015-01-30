package com.base.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.def.DefFactory;
import com.base.def.DefType;
import com.base.def.entity.DropItem;
import com.base.def.entity.LessItem;
import com.base.def.type.abs.ItemDef;
import com.base.def.type.item.ChestDef;
import com.base.exception.NotFoundDefException;
import com.base.pb.MsgDefineItem.ItemType;
import com.base.pb.MsgDefineRole.ChestOpenType;
import com.core.general.RatioHelper;

/**
 * 
 * @Create time : 2014-12-24
 * @author : wangl
 * @Description : 掉落处理工具
 */
public class DropHelper {
	private static Logger logger = LoggerFactory.getLogger(DropHelper.class);

	/**
	 * 忽略实际掉落数量，只获取一个
	 * 
	 * @param career
	 *            职业
	 * @param chestDefId
	 *            掉落盒子id
	 * @return 如果未掉落任何物品，则返回null
	 */
	public static LessItem dropOne(int career, int chestDefId) {
		if (chestDefId == 0) {
			return null;
		}
		ChestDef chestDef = DefFactory.instance().getDef(DefType.ITEM, chestDefId);
		if (chestDef == null) {
			throw new NotFoundDefException(DefType.ITEM, chestDefId);
		}
		ArrayList<LessItem> list = dropBox(career, chestDef);
		if (list == null || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	/**
	 * 掉落
	 * 
	 * @param career
	 *            职业
	 * @param chestDefId
	 *            掉落盒子id
	 * @return 如果没有掉落，返回0长度掉落
	 */
	public static ArrayList<LessItem> drop(int career, int chestDefId) {
		if (chestDefId == 0) {
			return new ArrayList<>();
		}
		ChestDef chestDef = DefFactory.instance().getDef(DefType.ITEM, chestDefId);
		if (chestDef == null) {
			logger.warn("not found chestDef by {}", chestDefId);
			return new ArrayList<>();
		}
		return dropBox(career, chestDef);
	}

	/**
	 * 开启盒子
	 * 
	 * @param career
	 *            职业
	 * @param chestDef
	 *            盒子
	 * @return
	 */
	public static ArrayList<LessItem> dropBox(int career, ChestDef chestDef) {
		return dropBox(career, chestDef, 1);
	}

	private static ArrayList<LessItem> dropBox(int career, ChestDef chestDef, int iteration) {
		if (iteration >= 5) {// 迭代超限
			throw new RuntimeException("chestBox iteration > 10, check your chestDef by " + chestDef);
		}
		ArrayList<LessItem> list = new ArrayList<>();
		Map<Integer, DropItem[]> dropItems = chestDef.getDropItems();
		DropItem[] careerItems = dropItems.get(career);
		switch (chestDef.getModle()) {
		case ChestOpenType.OPEN_ALL_VALUE:// 全部获得
			if (careerItems != null) {
				for (DropItem dropItem : careerItems) {
					list.add(new LessItem(dropItem.getItemId(), dropItem.getNum() * chestDef.getOpenCount()));
				}
			}
			break;
		case ChestOpenType.OPEN_RAND_VALUE:// 随机开启
			for (int i = 0; i < chestDef.getOpenCount(); i++) {
				DropItem dropItem = RatioHelper.random(careerItems);
				list.add(new LessItem(dropItem.getItemId(), dropItem.getNum()));
			}
			break;
		default:
			logger.error("error drop def {}", ToStringBuilder.reflectionToString(chestDef));
		}

		// 自动开启
		autOpen(career, list, iteration);
		return list;
	}

	/**
	 * 对于需要自动开启的宝箱，进行开启
	 * 
	 * @param items
	 * @return
	 */
	private static ArrayList<LessItem> autOpen(int career, List<LessItem> lessItems, int iteration) {
		ArrayList<LessItem> list = new ArrayList<>();
		for (LessItem lessItem : lessItems) {
			ItemDef itemDef = DefFactory.instance().getDef(DefType.ITEM, lessItem.getItemId());
			if (itemDef == null) {
				logger.error("not found item = " + lessItem.getItemId());
				continue;
			}
			if (itemDef.getType() != ItemType.CHEST_ITEM_VALUE) {
				list.add(lessItem);
				continue;// 不是宝箱
			}

			ChestDef chestDef = (ChestDef) itemDef;
			if (!chestDef.isAutOpen()) {
				list.add(lessItem);
				continue;// 不用自动开启
			}

			list.addAll(dropBox(career, chestDef, ++iteration));// 进行掉落
		}
		return list;
	}
}
