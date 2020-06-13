package com.hsc.designmodel.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * @ClassName: com.hsc.designmodel.pattern.behavioral.chainofresponsibility.ArticleApprover
 * @auther: 侯森川
 * @Date: 2020-6-13 11:02
 **/

public class VedioApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+"视频审核通过");
            if(approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName()+"视频审核不通过");
        }
    }
}
