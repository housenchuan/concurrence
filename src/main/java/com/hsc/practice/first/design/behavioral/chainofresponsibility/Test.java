package com.hsc.practice.first.design.behavioral.chainofresponsibility;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.chainofresponsibility.Test
 * @auther: 侯森川
 * @Date: 2020-6-23 17:26
 **/

public class Test {
    public static void main(String[] args) {
        Book book = new Book("深入理解Java虚拟机","java内存模型","周志明");
        Approver nameApprover = new NameApprover();
        Approver contentApprover = new ContentApprover();
        Approver authorApprover = new AuthorApprover();
        nameApprover.setApprover(contentApprover);
        contentApprover.setApprover(authorApprover);
        nameApprover.deploy(book);
    }
}
