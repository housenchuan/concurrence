package com.hsc.pattern.creational.singleton.attack;

import com.hsc.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 克隆攻击单例模式(防御这种攻击只需要不实现Cloneable接口即可)
 **/

public class CloneAttackSingleton  {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton instance = HungrySingleton.getInstance();
        Method cloneMethod = HungrySingleton.class.getDeclaredMethod("clone");
        HungrySingleton cloneObj = (HungrySingleton) cloneMethod.invoke(instance);
        System.out.println(instance);
        System.out.println(cloneObj);
    }
}
