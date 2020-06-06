package com.hsc.pattern.creational.prototype.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: com.hsc.pattern.creational.prototype.clone.Pig
 * @auther: 侯森川
 * @Date: 2020-6-6 17:02
 **/

public class Pig implements Cloneable{
    private String name;
    private Date birth;
    private ArrayList<Date> list;

    public Pig(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public ArrayList<Date> getList() {
        return list;
    }

    public void setList(ArrayList<Date> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig clone = (Pig)super.clone();
        clone.birth = (Date)clone.birth.clone();
        clone.list = (ArrayList<Date>)clone.list.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}'+super.toString();
    }
}
