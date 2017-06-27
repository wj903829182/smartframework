package org.smart4j.framework.bean;

/**
 * Created by jack on 2017/6/27.
 * 返回数据对象
 */
public class Data {
    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }

    /**
     * 获取数据
     *
     * @return
     */
    public Object getModel() {
        return model;
    }
}
