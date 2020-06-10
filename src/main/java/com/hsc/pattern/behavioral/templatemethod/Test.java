package com.hsc.pattern.behavioral.templatemethod;

/**
 * @ClassName: com.hsc.pattern.behavioral.templatemethod.Test
 * @auther: 侯森川
 * @Date: 2020-6-10 18:54
 **/

public class Test {
    public static void main(String[] args) {
        ACourse aCourse = new JavaDesignCourse();
        aCourse.makeCourse();

        System.out.println();

        ACourse aCourse1 = new PECourse(true);
        aCourse1.makeCourse();
    }
}
