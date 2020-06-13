package com.hsc.designmodel.pattern.behavioral.state;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.state.CourseVedioState
 * @auther: 侯森川
 * @Date: 2020-6-13 12:42
 **/

public abstract class CourseVedioState {
    protected  CourseVedioContext courseVedioContext;

    public void setCourseVedioContext(CourseVedioContext courseVedioContext) {
        this.courseVedioContext = courseVedioContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
