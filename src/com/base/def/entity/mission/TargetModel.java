package com.base.def.entity.mission;

import java.io.Serializable;

/**
 * 
 * @Create time : 2015-1-15
 * @author : zhaowei
 * @Description : TODO 目标模型
 */
public abstract class TargetModel implements Serializable {
	private static final long serialVersionUID = 614796350718027059L;

	/**
	 * 目标类型
	 * 
	 * @return
	 */
	public abstract int getTagetType();
}