package org.smart4j.framework.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by jack on 2017/6/28.
 * 切面代理
 */
public class AspectProxy implements Proxy{
    private static final Logger LOGGER = LoggerFactory.getLogger(AspectProxy.class);
    public Object doProxy(ProxyChain proxyChain) throws Throwable {
        Object result = null;
        Class<?> cls = proxyChain.getTargetClass();
        Method method = proxyChain.getTargetMethod();
        Object [] params = proxyChain.getMethodParams();
        begin();
        try {
            if (intercept(cls,method,params)){
                before(cls,method,params);
                result = proxyChain.doProxyChain();
                after(cls,method,params);
            }else {
                result = proxyChain.doProxyChain();
            }
        }catch (Exception e){
            LOGGER.error("proxy failure ",e);
            error(cls,method,params);
            throw e;
        }finally {
            end();
        }
        return result;
    }

    public boolean intercept(Class<?> cls,Method method,Object [] params) throws Throwable{
        return true;
    }
    public void before(Class<?> cls,Method method,Object [] params) throws Throwable{
    }
    public void after(Class<?> cls,Method method,Object [] params) throws Throwable{
    }
    public void error(Class<?> cls,Method method,Object [] params) throws Throwable{
    }
    public void begin(){}
    public void end(){}

}
