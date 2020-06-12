package com.hsc.designmodel.pattern.behavioral.command;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.command.OpenCourseVedioCommend
 * @auther: 侯森川
 * @Date: 2020-6-12 20:13
 **/

public class CloseCourseVedioCommend implements Commend{

    private CourseVedio courseVedio;

    public CloseCourseVedioCommend(CourseVedio courseVedio) {
        this.courseVedio = courseVedio;
    }

    @Override
    public void execute() {
        this.courseVedio.close();
    }
}
