package org.smart4j.framework;

import org.smart4j.framework.helper.BeanHelper;
import org.smart4j.framework.helper.ClassHelper;
import org.smart4j.framework.helper.ControllerHelper;
import org.smart4j.framework.helper.IocHelper;
import org.smart4j.framework.util.ClassUtil;

/**
 * Created by jack on 2017/5/24.
 * 加载相应类的，帮助类
 */
public final class HelperLoader {
    //初始化，加载类
    public static void init(){
        Class<?> [] classList = {ClassHelper.class, BeanHelper.class, IocHelper.class, ControllerHelper.class};
        for (Class<?> cls: classList) {
            ClassUtil.loadClass(cls.getName(),true);
        }
    }
}
