package com.zyfx.core.framework.common.utils;

import java.security.*;

/**
 * @Descript	: Md5 digest for a String.
 * @author 	: umessage software
 */
public class StrMd5 {
	
    public static void main(String[] args){
        //PwdMd5 md5=new StrMd5();
		String s="QD0000400060000011379061281218UNION_FLTVIEWBARGAINBYDAYhlxsecurykey<REQUESTXML><ENDFLTDATE>2013-10-12</ENDFLTDATE><FROM>PEK</FROM><STARTFLTDATE>2013-09-13</STARTFLTDATE><TO>SHA</TO></REQUESTXML>";
		try{
    		String str=StrMd5.md5Code(s);
    		System.out.println(str);
    		str=str.toUpperCase();
    		System.out.println(str);
    		if(str.equals(s)){
    			System.out.println(str);	
    		}
		}catch(Exception e){
		}
	}

    /**
     * 加密后转大写
     */
    public static String md5(String x) throws Exception {
        StringBuffer result = new StringBuffer();

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(x.getBytes("UTF8"));
        byte s[] = m.digest();
        for (int i = 0; i < s.length; i++) {
            result.append(Integer.toHexString( (0x000000FF & s[i]) | 0xFFFFFF00).
                          substring(6));
        }
        return result.toString().toUpperCase();
    }
    
    /**
     * 直接加密
     */
    public static String md5Code(String x) throws Exception {
        StringBuffer result = new StringBuffer();

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(x.getBytes("UTF8"));
        byte s[] = m.digest();
        for (int i = 0; i < s.length; i++) {
            result.append(Integer.toHexString( (0x000000FF & s[i]) | 0xFFFFFF00).
                    substring(6));
        }
        return result.toString();
    }
    
    /**
     * 直接加密
     */
    public static String md5GoTrip(String x) throws Exception {
        StringBuffer result = new StringBuffer();

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(x.getBytes("GB2312"));
        byte s[] = m.digest();
        for (int i = 0; i < s.length; i++) {
            result.append(Integer.toHexString( (0x000000FF & s[i]) | 0xFFFFFF00).
                    substring(6));
        }
        return result.toString();
    }
}