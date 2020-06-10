package com.hsc.pattern.structural.proxy.staticproxy.db;

/**
 * @ClassName: com.hsc.pattern.structural.proxy.staticproxy.db.DynamicDatasourceSource
 * @auther: 侯森川
 * @Date: 2020-6-10 15:09
 **/

public class DynamicDatasourceSource {

    public String dynamicRouterKey(){
        return DataSourceContextHolder.getDBType();
    }
}
