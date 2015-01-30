package com.base.def.type.item.material;

import java.util.HashMap;
import java.util.Map;

import com.base.def.type.abs.ItemDef;
import com.base.pb.MsgDefineItem.ItemType;
import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-7
 * @author : sunhua
 * @Description : 材料道具
 */
@Describle("材料")
public class MaterialDef extends ItemDef {
	private static final long serialVersionUID = 1452320338863809951L;
	@Describle("需要低级合成材料(id:数量;id:数量)如果为最底层材料没有低级合成材料不填")
	private Map<Integer, Integer> subMaterials;
	@Describle("合成该材料需要的金币数量")
	private int needGoldNum;

	public Map<Integer, Integer> getSubMaterials() {
		return subMaterials;
	}

	public void setSubMaterials(String subMaterials) {
		if ("".equals(subMaterials) || subMaterials == null) {
			return;
		}
		this.subMaterials = new HashMap<Integer, Integer>();
		String[] strs = subMaterials.split(StringHelper.leve2split);
		for (String str : strs) {
			int[] arr = StringHelper.toIntArray(StringHelper.leve4split, str);
			this.subMaterials.put(arr[0], arr[1]);
		}
	}

	public int getNeedGoldNum() {
		return needGoldNum;
	}

	public void setNeedGoldNum(int needGoldNum) {
		this.needGoldNum = needGoldNum;
	}

	@Override
	public int getType() {
		return ItemType.MATERIAL_ITEM_VALUE;
	}

}
