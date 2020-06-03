package com.hsc.pattern.creational.simplefactory;

/**
 * @ClassName: com.hsc.pattern.creational.simplefactory.Test
 * @auther: 侯森川
 * @Date: 2020-6-3 19:29
 **/

public class Test {
    public static void main(String[] args) {
//        Vedio vedio = new PythonVedio();
//        vedio.produce();
//        Vedio vedio2 = new JavaVedio();
//        vedio2.produce();

//        VedioFactory vedioFactory = new VedioFactory();
//        Vedio java = vedioFactory.getVedio("python");
//        java.produce();
        VedioFactory vedioFactory = new VedioFactory();
        Vedio vedio = vedioFactory.getVedio(PythonVedio.class);
        vedio.produce();
    }
}
