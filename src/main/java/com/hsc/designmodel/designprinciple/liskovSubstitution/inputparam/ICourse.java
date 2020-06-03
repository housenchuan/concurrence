package com.hsc.designmodel.designprinciple.liskovSubstitution.inputparam;

import java.util.AbstractMap;
import java.util.HashMap;

public class ICourse  {
    void readCourse(HashMap map){
        System.out.println("父类HashMap");
    };

}
