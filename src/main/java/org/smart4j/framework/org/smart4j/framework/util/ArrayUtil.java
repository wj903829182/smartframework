package org.smart4j.framework.org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by jack on 2017/5/23.
 * 数组工具类
 */
public class ArrayUtil {
    /**
     * 判断数组是否非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
