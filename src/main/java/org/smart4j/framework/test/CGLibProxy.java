package org.smart4j.framework.test;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jack on 2017/6/27.
 * 使用CGlib实现动态代理
 */
public class CGLibProxy implements MethodInterceptor{

    private static CGLibProxy instance = new CGLibProxy();
    public CGLibProxy() {
    }

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(object,args);
        after();
        return result;
    }

    private void before(){
        System.out.println("Before");
    }
    private void after(){
        System.out.println("After");
    }

    public <T> T getProxy(Class<T> cls){
        return (T) Enhancer.create(cls,this);
    }

    public static CGLibProxy getInstance(){
        return instance;
    }
}
