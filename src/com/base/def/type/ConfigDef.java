package com.base.def.type;

import com.base.def.BaseDef;
import com.base.def.DefType;
import com.xe.annotation.Describle;

/**
 * 
 * @Create time : 2014-6-18
 * @author : wangl
 * @Description : 服务器参数配置表
 */
@Describle("服务器参数配置表")
public class ConfigDef implements BaseDef<String> {
	private static final long serialVersionUID = 7349531164896103909L;
	@Describle("键")
	private String key;
	@Describle("值")
	private String value;

	@Override
	public String getId() {
		return key;
	}

	@Override
	public DefType getDefType() {
		return DefType.CONFIG;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
