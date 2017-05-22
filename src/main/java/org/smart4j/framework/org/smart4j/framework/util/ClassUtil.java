package org.smart4j.framework.org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Created by jack on 2017/5/22.
 * 类操作工具类
 */
public final class ClassUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);
    /**
     * 获取类加载器
     * 获取加载器类的实现比较简单，只需获取当前线程的ClassLoader
     */
    public static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }
    /**
     * 加载类
     */
    public static Class<?> loadClass(String className,boolean isInitialized){
        return null;
    }
    /**
     * 获取指定包名下所有的类
     */
    public static Set<Class<?>> getClassSet(String packageName){
        return null;
    }
}
