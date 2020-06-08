package com.hsc.pattern.structural.composite;

/**
 * 操作课程和课程目录
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持新增");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除");
    }
    public String getName(){
        throw new UnsupportedOperationException("不支持名称操作");
    }
    public double getPrice(){
        throw new UnsupportedOperationException("不支持价格操作");
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
