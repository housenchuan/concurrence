package com.hsc.pattern.structural.composite;

public class Course extends CatalogComponent {
    private String name;
    private double cost;

    public Course(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.cost;
    }

    @Override
    public void print() {
        System.out.println(this.name+"  :  "+this.cost);
    }
}
