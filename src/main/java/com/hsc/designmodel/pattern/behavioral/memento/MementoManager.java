package com.hsc.designmodel.pattern.behavioral.memento;

import java.util.Stack;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.memento.MementoManager
 * @auther: 侯森川
 * @Date: 2020-6-12 19:03
 **/

public class MementoManager {
    private static final Stack<ArticleMemento> MEMENT_CACHE = new Stack<>();
    public static void setMementCache(ArticleMemento articleMemento){
        MEMENT_CACHE.push(articleMemento);
    }
    public static ArticleMemento getMementCache(){
        return MEMENT_CACHE.pop();
    }
}
