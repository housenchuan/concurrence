package com.hsc.pattern.behavioral.templatemethod;

/**
 * @ClassName: com.hsc.pattern.behavioral.templatemethod.PECourse
 * @auther: 侯森川
 * @Date: 2020-6-10 18:53
 **/

public class PECourse extends ACourse {

    private boolean isWriteFlag = false;

    public PECourse(boolean isWriteFlag) {
        this.isWriteFlag = isWriteFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("打包前端图片、源码");
    }

    @Override
    boolean isWriteArticle() {
        return isWriteFlag;
    }
}
