package com.hsc.designmodel.pattern.behavioral.memento;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.memento.Test
 * @auther: 侯森川
 * @Date: 2020-6-12 19:07
 **/

public class Test {
    public static void main(String[] args) {

        Article article1 = new Article("java1","javaTitle1","javaContent1");
        MementoManager.setMementCache(article1.addMemento());

        article1.setName("java2");
        article1.setTitle("title2");
        article1.setContent("content2");
        MementoManager.setMementCache(article1.addMemento());

        article1.setName("java3");
        article1.setTitle("title3");
        article1.setContent("content3");
//        MementoManager.setMementCache(article1.addMemento());


        article1.undoFromMemento(MementoManager.getMementCache());

        article1.undoFromMemento(MementoManager.getMementCache());

        System.out.println();
    }
}
