package com.hsc.practice.first.design.creational.singleton.attack;


import com.hsc.practice.first.design.creational.singleton.HungrySingleton;

import java.io.*;

/**
 * 序列化攻击
 * @auther: 侯森川
 * @Date: 2020-6-20 15:39
 **/

public class SerializableAttack {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance_file"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("instance_file")));
        HungrySingleton otherInstance = (HungrySingleton)ois.readObject();
        System.out.println(instance);
        System.out.println(otherInstance);
    }
}
