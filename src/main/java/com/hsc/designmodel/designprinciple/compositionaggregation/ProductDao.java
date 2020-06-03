package com.hsc.designmodel.designprinciple.compositionaggregation;

public class ProductDao{
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        System.out.println("使用"+dbConnection.getConnection());
    }
}
