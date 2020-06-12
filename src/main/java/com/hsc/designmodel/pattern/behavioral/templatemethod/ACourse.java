package com.hsc.designmodel.pattern.behavioral.templatemethod;

/**
 * @ClassName: ACourse
 * @auther: 侯森川
 * @Date: 2020-6-10 17:28
 **/

public abstract class ACourse {
    protected final void makeCourse(){
        makePPT();
        makeVedio();
        if(isWriteArticle()){
            writeArticle();
        }
    }
    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVedio(){
        System.out.println("制作视频");
    }
    final void writeArticle(){
        System.out.println("编写手记");
    }
    /*设置一个钩子方法*/
    boolean isWriteArticle(){
        return false;
    }

    abstract void packageCourse();
}
