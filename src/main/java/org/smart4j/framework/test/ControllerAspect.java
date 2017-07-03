package org.smart4j.framework.test;

import org.smart4j.framework.annotation.Aspect;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.proxy.AspectProxy;

/**
 * Created by jack on 2017/6/28.
 * 拦截Controller所有方法
 */
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy{
}
