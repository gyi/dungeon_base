package com.base.def.type.abs;

import org.apache.commons.lang3.StringUtils;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2015-1-4
 * @author : sunhua
 * @Description : 道具基类配置
 */
public abstract class ItemDef implements BaseDef<Integer> {
	private static final long serialVersionUID = -4877971386006348010L;
	@Describle("道具id")
	private int id;
	@Describle("道具名称")
	private String name;
	@Describle("品质")
	private int quality;
	@Describle("是否可叠加")
	private boolean isOverlay;
	@Describle("最大堆叠数量")
	private int groupNum;
	@Describle("使用等级")
	private int useLevel;
	@Describle("使用职业")
	private int useCareer;
	@Describle("是否可出售")
	private boolean isSale;
	@Describle("出售价格，不能出售填0")
	private int sellPrice;
	@Describle("出售得到的货币类型")
	private int specialID;
	@Describle("有效时间，单位s，无需有效时间限制填0")
	private int validTime;
	@Describle("是否唯一")
	private boolean isUnique;
	@Describle("是否可使用")
	private boolean canUse;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public DefType getDefType() {
		return DefType.ITEM;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 道具类型
	 * 
	 * @return
	 */
	public abstract int getType();

	/**
	 * 该道具是否能够使用
	 * 
	 * @return
	 */
	public boolean canUse() {
		return canUse;
	}

	public boolean isOverlay() {
		return isOverlay;
	}

	public void setOverlay(boolean isOverlay) {
		this.isOverlay = isOverlay;
	}

	public boolean isSale() {
		return isSale;
	}

	public void setSale(boolean isSale) {
		this.isSale = isSale;
	}

	public boolean isCanUse() {
		return canUse;
	}

	public void setCanUse(boolean canUse) {
		this.canUse = canUse;
	}

	public void setUseCareer(int useCareer) {
		this.useCareer = useCareer;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public int getUseLevel() {
		return useLevel;
	}

	public void setUseLevel(int useLevel) {
		this.useLevel = useLevel;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public int getValidTime() {
		return validTime;
	}

	public void setValidTime(int validTime) {
		this.validTime = validTime;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		if (quality == null) {
			return;
		}
		this.quality = Integer.valueOf(quality);
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUseCareer() {
		return useCareer;
	}

	public void setUseCareer(String useCareer) {
		if (StringUtils.isEmpty(useCareer)) {
			return;
		}
		this.useCareer = Integer.valueOf(useCareer);
	}

	public int getSpecialID() {
		return specialID;
	}

	public void setSpecialID(int specialID) {
		this.specialID = specialID;
	}
}
