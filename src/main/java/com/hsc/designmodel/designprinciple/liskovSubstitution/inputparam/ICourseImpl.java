package com.hsc.designmodel.designprinciple.liskovSubstitution.inputparam;

import java.util.HashMap;
import java.util.Map;

public class ICourseImpl extends ICourse {

//    @Override
//    public void readCourse(HashMap map) {
//        System.out.println("子类HashMap");
//    }

    public void readCourse(Map map) {
        System.out.println("子类Map");
    }
}
