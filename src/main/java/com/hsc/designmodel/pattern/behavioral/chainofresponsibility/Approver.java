package com.hsc.designmodel.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.chainofresponsibility.Approver
 * @auther: 侯森川
 * @Date: 2020-6-13 11:00
 **/

public abstract class Approver {

    protected Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
