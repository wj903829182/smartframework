package org.smart4j.framework.test;

import java.lang.reflect.Proxy;

/**
 * Created by jack on 2017/6/27.
 */
public class MainTest1 {
    public static void main(String[] args) {
       /* Hello helloProxy = new HelloProxy();
        helloProxy.sayHello("JACK");*/
       //测试JDK实现的动态代理
       /* Hello hello = new HelloImp();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloProxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), dynamicProxy);
        helloProxy.sayHello("jack");*/
        DynamicProxy dynamicProxy = new DynamicProxy(new HelloImp());
        Hello helloProxy = dynamicProxy.getProxy();
        helloProxy.sayHello("jack");
    }
}
