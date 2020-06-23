package com.hsc.practice.first.design.behavioral.chainofresponsibility;

/**
 * @ClassName: com.hsc.practice.first.design.behavioral.chainofresponsibility.Approver
 * @auther: 侯森川
 * @Date: 2020-6-23 17:01
 **/

public abstract class Approver {
    protected Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    public abstract void deploy(Book book);
}
