package org.smart4j.framework.org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by jack on 2017/5/23.
 * 字符串工具类
 */
public class StringUtil {
    /*
    * 判断字符串是否为空
    * */
    public static boolean isEmpty(String str){
        if(str != null){
            str=str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    /*
    * 判断字符串是否非空
    * */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
