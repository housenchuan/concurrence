package com.hsc.designmodel.pattern.creational.prototype;

/**
 * @ClassName: MailUtil
 * @auther: 侯森川
 * @Date: 2020-6-6 16:40
 **/

public class MailUtil {
    public static void sendMail(Mail mail){
        System.out.printf("发送邮件，邮件名称：%s，地址：%s，内容：%s --- %s \n",mail.getName(),mail.getContent(),mail.getAddress(),mail);
    }
    public static void saveMail(Mail mail){
        System.out.println("保存邮件:"+mail.getContent());
    }
}
