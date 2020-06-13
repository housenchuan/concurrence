package com.hsc.designmodel.pattern.behavioral.chainofresponsibility;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.chainofresponsibility.Test
 * @auther: 侯森川
 * @Date: 2020-6-13 11:05
 **/

public class Test {
    public static void main(String[] args) {
        Course course = new Course("java","java手记","java视频");
        Approver articleApprover = new ArticleApprover();
        Approver vedioApprover = new VedioApprover();
        articleApprover.setApprover(vedioApprover);
        articleApprover.deploy(course);
    }
}
