package com.hsc.designmodel.pattern.creational.simplefactory;

/**
 * @ClassName: BananaFactory
 * @auther: 侯森川
 * @Date: 2020-6-3 19:31
 **/

public class VedioFactory {
//    public Vedio getVedio(String type){
//        if("java".equals(type)){
//            return new JavaVedio();
//        }else if("python".equals(type)){
//            return new PythonVedio();
//        }
//        return null;
//    }
    //弥补破坏开闭原则
    public Vedio getVedio(Class clazz){
        Vedio vedio = null;
        try {
                vedio = (Vedio)Class.forName(clazz.getName()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        return vedio;
    }
}
