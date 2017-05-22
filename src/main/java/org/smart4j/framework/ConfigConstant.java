package org.smart4j.framework;

/**
 * Created by jack on 2017/5/22.
 * 提供相关常量配置项
 */
public interface ConfigConstant {
    String CONFIG_FILE="smart.properties";
    String JDBC_DRIVER="smart.framework.jdbc.driver";
    String JDBC_URL="smart.framework.jdbc.url";
    String JDBC_USERNAME="smart.framework.jdbc.username";
    String JDBC_PASSWORD="smart.framework.jdbc.password";

    String APP_BASE_PACKAGE="smart.framework.app.base_package";
    String APP_JSP_PATH="smart.framework.app.jsp_path";
    String APP_ASSET_PATH="smart.framework.app.asset_path";
}
