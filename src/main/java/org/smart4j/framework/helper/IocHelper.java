package org.smart4j.framework.helper;


import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.org.smart4j.framework.util.ArrayUtil;
import org.smart4j.framework.org.smart4j.framework.util.CollectionUtil;
import org.smart4j.framework.org.smart4j.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by jack on 2017/5/23.
 * 依赖注入助手类
 */
public class IocHelper {
    static {
        //获取所有的Bean类与Bean实例之间的关系（简称Bean Map）
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            //遍历beanMap
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                //从beanMap中获取bean类与bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //获取Bean类定义的所有成员变量（简称Bean Field）
                Field [] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)){
                    //遍历beanField
                    for (Field beanField : beanFields) {
                        //判断当前的Bean Field是否带有Inject注解
                        if (beanField.isAnnotationPresent(Inject.class)){
                            //在Bean Map中获取Bean Field对应的实例
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null){
                                //通过放射初始化beanField值
                                ReflectionUtil.setField(beanInstance,beanField,beanFieldInstance);
                            }
                        }
                    }
                }


            }
        }
    }
}
