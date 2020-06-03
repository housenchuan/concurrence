package com.hsc.designmodel.designprinciple.liskovSubstitution.inputparam;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        ICourseImpl iCourse = new ICourseImpl();
        iCourse.readCourse(new HashMap());
    }

}
