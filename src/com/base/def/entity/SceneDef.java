package com.base.def.entity;

import java.io.Serializable;

import com.core.general.StringHelper;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-11-27
 * @author : wangl
 * @Description : 场景数据
 */
public class SceneDef implements Serializable {
	private static final long serialVersionUID = -9101331306934220321L;
	@Describle("x集合")
	private int[] xs;
	@Describle("y集合")
	private int[] ys;
	@Describle("z集合")
	private int[] zs;
	@Describle("顶点索引")
	private int[] indexs;
	@Describle("障碍墙")
	private LineDef[] lineDefs;

	public int[] getXs() {
		return xs;
	}

	public void setXs(String xs) {
		this.xs = StringHelper.toIntArray(StringHelper.leve1split, xs);
	}

	public int[] getYs() {
		return ys;
	}

	public void setYs(String ys) {
		this.ys = StringHelper.toIntArray(StringHelper.leve1split, ys);
	}

	public int[] getZs() {
		return zs;
	}

	public void setZs(String zs) {
		this.zs = StringHelper.toIntArray(StringHelper.leve1split, zs);
	}

	public int[] getIndexs() {
		return indexs;
	}

	public void setIndexs(String indexs) {
		this.indexs = StringHelper.toIntArray(StringHelper.leve1split, indexs);
	}

	public LineDef[] getLineDefs() {
		return lineDefs;
	}

	public void setLineDefs(LineDef[] lineDefs) {
		this.lineDefs = lineDefs;
	}

}
