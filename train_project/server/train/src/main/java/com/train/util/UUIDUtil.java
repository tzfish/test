package com.train.util;

import java.util.UUID;

public class UUIDUtil {

	public static String uuid() {
		// 创建 GUID 对象
		UUID uuid = UUID.randomUUID();

		// 得到对象产生的ID
		String a = uuid.toString();

		// 转换为大写
		a = a.toUpperCase();

		// 替换 -
		return a.replaceAll("-", "");
	}
}
