package com.hsc.designmodel.designprinciple.compositionaggregation;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MYSQL 连接";
    }
}
