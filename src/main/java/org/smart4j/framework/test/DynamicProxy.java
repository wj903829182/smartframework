package org.smart4j.framework.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by jack on 2017/6/27.
 * 使用JDK实现动态代理
 */
public class DynamicProxy implements InvocationHandler{
    private Object target;

    public DynamicProxy(Object target) {
        //保存真实的对象
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        //通过反射调用函数
        Object result = method.invoke(target,args);
        after();
        //返回函数调用的返回结果
        return result;
    }

    private void before(){
        System.out.println("Before");
    }
    private void after(){
        System.out.println("After");
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
