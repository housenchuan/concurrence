package com.hsc.concurrence.multithreadpractice;

import java.util.*;

/**
 * @ClassName: com.hsc.concurrence.multithreadpractice.ListPractice
 * @auther: 侯森川
 * @Date: 2020-5-11 20:10
 **/

public class ListPractice {
//    static int a = 0;
//    static int b = 0;
    public static void main(String[] args) {
        MapPractice();


    }

    public static void MapPractice(){
//        Map<String,String> innerMap = new HashMap<>(9);
//        innerMap.put("name","jack");
//        innerMap.put("age","32");
//        Iterator i = innerMap.entrySet().iterator();
//        innerMap.keySet();
//        while (i.hasNext()){
//            Object obj =  i.next();
//            System.out.println();
//        }
//          Object []obj = {};
//          System.out.println(obj.length);
//        Map map = new Hashtable();
//        map.put(null,"");
//        System.out.println();
//        Map<String,String> map = new HashMap<>(innerMap);
//        map.entrySet().forEach(stringStringEntry -> {
//
//        });
//        map.entrySet().contains(map);
//        System.out.println(map.put("name","jack"));
//        System.out.println(map.put("name","jack"));
//        int n = 14 -1;
//        System.out.println(n |= n >>> 1);
//        System.out.println(n |= n >>> 2);
//        System.out.println(n |= n >>> 4);
//        System.out.println(n |= n >>> 8);
//        System.out.println(n |= n >>> 16);
//        System.out.println((n >= 100) ? 1000 : n + 1);
//        System.out.println(15&3373752);


        Hashtable hashtable = new Hashtable();
        hashtable.put("name","jack");
        hashtable.put("age","23");
        System.out.println(hashtable.keys().hasMoreElements());
        System.out.println(hashtable.keys().nextElement());
        System.out.println(hashtable.values());
    }


    public static void ListPractice(){
        ArrayList list  = new ArrayList();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.remove("a3");
        list.add(1,"test_a3");

        Vector other = new Vector();
        other.add("b1");
        other.add("b2");
        other.add("a3");
        other.remove("a3");
        other.add(1,"test_a3");

        LinkedList linkl = new LinkedList<>();
        linkl.addAll(list);
        linkl.add("me");
        linkl.addAll(1,other);
        //向双向链表尾部添加元素3
        linkl.offer("kk");
        //拿链表的第一个元素
        Object res = linkl.peek();
        //删除链表的第一个元素
        Object delObj = linkl.poll();
        System.out.println(1 << 30);
        System.out.println(Integer.MAX_VALUE >> 1);
    }
}
