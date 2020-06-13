package com.hsc.designmodel.pattern.behavioral.state;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.state.CourseVedioContext
 * @auther: 侯森川
 * @Date: 2020-6-13 12:43
 **/

public class CourseVedioContext {
    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static StopState STOP_STATE = new StopState();

    private CourseVedioState courseVedioState;
    public CourseVedioState getCourseVedioState() {
        return courseVedioState;
    }
    public void setCourseVedioState(CourseVedioState courseVedioState) {
        this.courseVedioState = courseVedioState;
        this.courseVedioState.setCourseVedioContext(this);
    }

    public void play(){
        this.courseVedioState.play();
    }
    public void speed(){
        this.courseVedioState.speed();
    }
    public void pause(){
        this.courseVedioState.pause();
    }
    public void stop(){
        this.courseVedioState.stop();
    }
}
