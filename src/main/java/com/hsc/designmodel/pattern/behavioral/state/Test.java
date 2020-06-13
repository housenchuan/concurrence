package com.hsc.designmodel.pattern.behavioral.state;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.state.Test
 * @auther: 侯森川
 * @Date: 2020-6-13 12:52
 **/

public class Test {
    public static void main(String[] args) {
        CourseVedioContext courseVedioContext = new CourseVedioContext();
        courseVedioContext.setCourseVedioState(new PlayState());
        System.out.println(courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.speed();
        System.out.println(courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.pause();
        System.out.println(courseVedioContext.getCourseVedioState().getClass().getSimpleName());

        courseVedioContext.stop();
        System.out.println(courseVedioContext.getCourseVedioState().getClass().getSimpleName());
        courseVedioContext.pause();
    }
}
