package org.smart4j.framework.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jack on 2017/6/27.
 * json工具类，用于处理json与pojo之间的转化，基于Jackson实现
 */
public final class JsonUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将POJO转化为json
     *
     * @param object
     * @param <T>
     * @return
     */
    public static <T> String toJson(Object object) {
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.error("convert POJO to JSON failure ", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将json转为pojo
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json,Class<T> type){
        T pojo;
        try {
            pojo = OBJECT_MAPPER.readValue(json,type);
        }catch (Exception e){
            LOGGER.error("convert JSON to POJO failure",e);
            throw new RuntimeException(e);
        }
        return pojo;
    }
}
