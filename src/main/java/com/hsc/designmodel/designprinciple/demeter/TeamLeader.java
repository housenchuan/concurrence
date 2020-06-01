package com.hsc.designmodel.designprinciple.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkNumOfCourse(){
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("课程的数量是:"+list.size());
    }
}
