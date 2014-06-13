package test;

public class TestChar {


	/**
	 * 判定输入汉字
	 * @param c
	 * @return
	 */
    public static  boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
             || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
            || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
            || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            return true;
        }
        return false;
    }
        
	/**
	 * 检测String是否全是中文
	 * @param name
	 * @return
	 */
   public static  boolean checkNameChese(String name)
   {
           boolean res=true;
           char [] cTemp = name.toCharArray(); 
           for(int i=0;i<name.length();i++)
           {
                   if(!isChinese(cTemp[i]))
                   {
                           res=false;
                           break;
                   }
           }           
           return res;
   }
   
  /**
   * 功能：判断一个字符串是否包含特殊字符
   * @param string 要判断的字符串
   * @return true  包含特殊字符
   * @return false 不包含特殊字符
   */
  public static boolean isConSpeCharacters(String string) {
   // TODO Auto-generated method stub
   if(string.replaceAll("[\u4e00-\u9fa5]*[a-z]*[A-Z]*\\d*-*_*\\s*", "").length()==0){
    //如果不包含特殊字符
    return  false;
   }
   return true;
  }
  
  
   public static void main(String[] args) {
	String name = "说%";
	boolean isChine = TestChar.isConSpeCharacters(name);
	System.out.println(isChine);
}


}
