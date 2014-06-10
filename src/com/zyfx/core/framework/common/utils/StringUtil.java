package com.zyfx.core.framework.common.utils;

public class StringUtil {

	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String isNullOrEmpty(String str1,String str2){
		if(null == str1 || "".equals(str1) ){
			return str2;
		}
		return str1;
	}
	
	public static boolean isNullOrEmpty(String str){
		return (str == null || "".equals(str))?true:false;
	}
	
}
