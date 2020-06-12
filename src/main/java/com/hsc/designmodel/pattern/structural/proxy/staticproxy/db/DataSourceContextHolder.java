package com.hsc.designmodel.pattern.structural.proxy.staticproxy.db;

/**
 * @ClassName: DataSourceContextHolder
 * @auther: 侯森川
 * @Date: 2020-6-10 15:14
 **/

public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();
    public static void setDBType(String dbKey){
        CONTEXT_HOLDER.set(dbKey);
    }
    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }
    public static void clear(){
        CONTEXT_HOLDER.remove();
    }
}
