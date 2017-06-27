package org.smart4j.framework.test;

/**
 * Created by jack on 2017/6/27.
 */
public class HelloProxy implements Hello{
    private Hello hello;
    public void sayHello(String name) {
        before();
        hello.sayHello(name);
        after();
    }

    public HelloProxy() {
        this.hello = new HelloImp();
    }
    private void before(){
        System.out.println("Before");
    }
    private void after(){
        System.out.println("After");
    }
}
