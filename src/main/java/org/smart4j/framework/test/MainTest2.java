package org.smart4j.framework.test;

/**
 * Created by jack on 2017/6/27.
 * CGlib动态代理测试
 *
 */
public class MainTest2 {
    public static void main(String[] args) {
      Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImp.class);
      helloProxy.sayHello("jack");
    }
}
