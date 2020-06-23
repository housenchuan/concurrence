package com.hsc.practice.first.design.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.chainofresponsibility.NameApprover
 * @auther: 侯森川
 * @Date: 2020-6-23 17:03
 **/

public class ContentApprover extends Approver{

    @Override
    public void deploy(Book book) {
        if(StringUtils.isEmpty(book.getContent())){
            System.out.println("内容为空，不通过");
        }else{
            System.out.println("内容通过");
            if(null != approver){
                approver.deploy(book);
            }
        }
    }
}
