package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by jack on 2017/6/27.
 * 切面注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     * @return
     */
    Class<? extends Annotation> value();
}
