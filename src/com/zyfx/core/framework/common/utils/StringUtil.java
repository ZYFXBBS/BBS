package com.zyfx.core.framework.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	/**
	 * 判断字符串是否为 空
	 * @param str
	 * @return
	 */
	public static boolean isNullOrEmpty(String str){
		return (str == null || "".equals(str))?true:false;
	}
	
	/**
	 * 判断 是否 只包含中文 和 引文字母
	 * @param str
	 * @return 不包含 返回false 包含 true
	 */
	private static boolean isName(String str){
		if(str==null){
			return false;
		}else{
			return str.matches("^[a-zA-Z\u4e00-\u9fa5]+$");
		}
	}
	
	/**
	 * 判断一个字符串是否手机号
	 * @param str
	 * @return
	 */
	public static final boolean isPhoneNum(String str){
		if(str==null||str.equals("")){
			return false;
		}else{
			return str.matches("^(13|15|18|14)\\d{9}$");
		}
	}
	/**
	 * 邮箱格式判断
	 * @param str
	 * @return
	 */
	public static final boolean isEmailAdressFormat(String str){
		if(str==null||str.equals("")){
			return false;
		}else{
		  Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");   
	      Matcher m = p.matcher(str);   
	      boolean b = m.matches(); 
	      return b;
		}
      
	}
	/**
	 * 是否是会员号
	 * @param str
	 * @return
	 */
	public static final boolean isMemberNo(String str){
		if(str!=null){
			return str.matches("^[0-9]{9}$");
		}else{
			return false;
		}	
	}
	/**
	 * 是否是手机号
	 * @param str
	 * @return
	 */
	public static final boolean isMobile(String str){
		if(str==null){
			return false;
		}else{
			return str.matches("^0{0,1}(13[0-9]|15[5-9]|15[0-3]|18[5-8]|147|18[0-3])[0-9]{8}$");
		}
	}
	/**
	 * 是否是中文
	 * @param str
	 * @return
	 */
	public static final boolean isChineseChar(String str){
		if(str==null){
			return false;
		}else{
			return str.matches("^[\u4e00-\u9fa5]+$");
		}
	}
	
	/**
	 * 是否是英文名
	 * @param str
	 * @return
	 */
	public static final boolean isEnName(String str){
		if(str==null){
			return false;
		}else{
			return str.matches("^[a-zA-Z]+/[a-z A-Z]+$");
		}
	}
	
	
}
