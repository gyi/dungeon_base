package com.base.def;

import java.io.Serializable;

/**
 * 
 * @Create 2013-12-30
 * @author wangl
 * @Description 配置接口
 */
public interface BaseDef<PK extends Serializable> extends Serializable {

	public abstract PK getId();

	public DefType getDefType();

}
