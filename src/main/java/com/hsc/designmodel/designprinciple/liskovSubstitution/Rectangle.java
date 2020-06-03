package com.hsc.designmodel.designprinciple.liskovSubstitution;

/**
 * 长方形
 **/

public class Rectangle implements Quadrangle{
    private int width;
    private int length;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
