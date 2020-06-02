package com.hsc.designmodel.designprinciple.liskovSubstitution;

/**
 * 正方形
 **/

public class Square implements Quadrangle{
    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getLength() {
        return sideLength;
    }

    @Override
    public int getWidth() {
        return sideLength;
    }
}
