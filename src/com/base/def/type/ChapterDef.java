package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-8
 * @author : wangl
 * @Description : 章节配置
 */
@Describle("章节配置")
public class ChapterDef implements BaseDef<Integer> {
	private static final long serialVersionUID = 7694500023762802118L;

	@Describle("章节id")
	private int id;
	@Describle("下一章节")
	private int nextId;
	@Describle("普通关卡id集合，第一个为首选关卡")
	private int[] normalIds;
	@Describle("精英关卡id集合")
	private int[] eliteIds;

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public DefType getDefType() {
		return DefType.CHAPTER;
	}

	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}

	public int[] getNormalIds() {
		return normalIds;
	}

	public void setNormalIds(int[] normalIds) {
		this.normalIds = normalIds;
	}

	public int[] getEliteIds() {
		return eliteIds;
	}

	public void setEliteIds(int[] eliteIds) {
		this.eliteIds = eliteIds;
	}

	public void setId(int id) {
		this.id = id;
	}

}
