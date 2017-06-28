package org.smart4j.framework.proxy;

/**
 * Created by jack on 2017/6/28.
 * 代理接口
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
