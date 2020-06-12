package com.hsc.designmodel.pattern.structural.proxy.staticproxy.db;

/**
 * @ClassName: DynamicDatasourceSource
 * @auther: 侯森川
 * @Date: 2020-6-10 15:09
 **/

public class DynamicDatasourceSource {

    public String dynamicRouterKey(){
        return DataSourceContextHolder.getDBType();
    }
}
