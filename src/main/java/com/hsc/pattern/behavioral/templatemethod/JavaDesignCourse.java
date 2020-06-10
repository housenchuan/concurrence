package com.hsc.pattern.behavioral.templatemethod;

/**
 * @ClassName: com.hsc.pattern.behavioral.templatemethod.JavaDesignCourse
 * @auther: 侯森川
 * @Date: 2020-6-10 18:53
 **/

public class JavaDesignCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("打包Java设计模式的源代码");
    }

    @Override
    boolean isWriteArticle() {
        return true;
    }
}
