package com.hsc.designmodel.pattern.behavioral.command;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.command.Test
 * @auther: 侯森川
 * @Date: 2020-6-12 20:14
 **/

public class Test {
    public static void main(String[] args) {
        CourseVedio courseVedio = new CourseVedio("java");
        Staff staff = new Staff();
        OpenCourseVedioCommend openCourseVedioCommend = new OpenCourseVedioCommend(courseVedio);
        CloseCourseVedioCommend closeCourseVedioCommend = new CloseCourseVedioCommend(courseVedio);

        staff.addCommend(openCourseVedioCommend);
        staff.addCommend(closeCourseVedioCommend);
        staff.executeCommendList();
    }
}
