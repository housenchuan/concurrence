package com.hsc.designmodel.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum  EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //反序列化攻击
        EnumInstance instance = EnumInstance.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance_file"));
//        oos.writeObject(instance);
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("instance_file")));
//        EnumInstance serInstance = (EnumInstance) ois.readObject();
//        System.out.println(instance);
//        System.out.println(serInstance);
//        System.out.println(instance == serInstance);

        //反射攻击
        Constructor<EnumInstance> constructor = EnumInstance.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumInstance enumInstance = constructor.newInstance("java",11);
        System.out.println(instance);
        System.out.println(enumInstance);
        System.out.println(instance == enumInstance);

    }
}
