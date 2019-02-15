package com.mlz.common.utils;

/** 
* @Description:  
* @Param:  
* @return:  
* @Author: Mr.Zhu 
* @Date: 2019/2/15 
*/ 
public class ConsoleJsonFormat {
    /** 
    * @Description:
    * @Param: [resString] 
    * @return: java.lang.String 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/15 
    */ 
    public static String responseFormat(String resString){

        StringBuffer jsonForMatStr = new StringBuffer();
        int level = 0;
        for(int index=0;index<resString.length();index++)//将字符串中的字符逐个按行输出
        {
            //获取s中的每个字符
            char c = resString.charAt(index);

            //level大于0并且jsonForMatStr中的最后一个字符为\n,jsonForMatStr加入\t
            if (level > 0  && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
                jsonForMatStr.append(getLevelStr(level));
            }
            //遇到"{"和"["要增加空格和换行，遇到"}"和"]"要减少空格，以对应，遇到","要换行
            switch (c) {
                case '{':
                case '[':
                    jsonForMatStr.append(c + "\n");
                    level++;
                    break;
                case ',':
                    jsonForMatStr.append(c + "\n");
                    break;
                case '}':
                case ']':
                    jsonForMatStr.append("\n");
                    level--;
                    jsonForMatStr.append(getLevelStr(level));
                    jsonForMatStr.append(c);
                    break;
                default:
                    jsonForMatStr.append(c);
                    break;
            }
        }
        return jsonForMatStr.toString();
    }
    /** 
    * @Description:  
    * @Param: [level] 
    * @return: java.lang.String 
    * @Author: Mr.Zhu 
    * @Date: 2019/2/15 
    */ 
    private static String getLevelStr(int level) {
        StringBuffer levelStr = new StringBuffer();
        for (int levelI = 0; levelI < level; levelI++) {
            levelStr.append("\t");
        }
        return levelStr.toString();
    }
}
