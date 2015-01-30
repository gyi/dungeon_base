package com.base.def.entity;

import java.io.Serializable;

import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-12-9
 * @author : wangl
 * @Description : 地图内部的阵营配置
 */
public class MapCampDef implements Serializable {
	private static final long serialVersionUID = 6465623489083198932L;
	@Describle("阵营id")
	private int id;
	@Describle("阵营下标")
	private int index;
	@Describle("阵营关系")
	private int[] relations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int[] getRelations() {
		return relations;
	}

	public void setRelations(String relations) {
		this.relations = StringHelper.toIntArray(StringHelper.leve1split, relations);
	}

}
