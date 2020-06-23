package com.hsc.practice.first.design.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.chainofresponsibility.NameApprover
 * @auther: 侯森川
 * @Date: 2020-6-23 17:03
 **/

public class AuthorApprover extends Approver{

    @Override
    public void deploy(Book book) {
        if(StringUtils.isEmpty(book.getName())){
            System.out.println("作者为空，不通过");
        }else{
            System.out.println("作者通过");
            if(null != approver){
                approver.deploy(book);
            }
        }
    }
}
