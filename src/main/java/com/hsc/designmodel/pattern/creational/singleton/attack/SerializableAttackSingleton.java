package com.hsc.designmodel.pattern.creational.singleton.attack;

import com.hsc.designmodel.pattern.creational.singleton.HungrySingleton;

import java.io.*;

/**
 * 反序列化攻击，即使单例类中有readResolve方法反序列化得时候返回相同的instance 但这个过程中还是会新建一个对象
 */
public class SerializableAttackSingleton {
    public static void main(String[] args) throws Exception{
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single_tone"));
        oos.writeObject(instance);

        File file = new File("single_tone");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
