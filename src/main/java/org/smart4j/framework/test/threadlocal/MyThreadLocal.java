package org.smart4j.framework.test.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jack on 2017/7/18.
 */
public class MyThreadLocal <T>{
    //创建一个现场安全的Map
    private Map<Thread, T> container = Collections.synchronizedMap(new HashMap<Thread, T>());
    public void set(T value){
        container.put(Thread.currentThread(),value);
    }

    public T get() {
        //获取目前的线程
        Thread thread = Thread.currentThread();
        T value = container.get(thread);
        if (value == null && !container.containsKey(thread)) {
            value = initialValue();
            container.put(thread, value);
        }
        return value;
    }

    public void remove() {
        container.remove(Thread.currentThread());
    }
    protected T initialValue() {
        return null;
    }
}
