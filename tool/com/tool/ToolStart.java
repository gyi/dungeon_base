package com.tool;

import com.xe.XETool;

public class ToolStart {

	public static String path = "com.base.def.type";
	public static boolean hasType = false;// 是否加入标签

	public static void main(String[] args) throws Exception {
		XETool.start(path, hasType);
	}
}
