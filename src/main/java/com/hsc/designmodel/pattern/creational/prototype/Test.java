package com.hsc.designmodel.pattern.creational.prototype;

/**
 * @ClassName: Test
 * @auther: 侯森川
 * @Date: 2020-6-6 16:43
 **/

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("技术邮件");
        for (int i = 0; i < 10; i++) {
            Mail cloneMail = (Mail)mail.clone();
            cloneMail.setName("jack"+i);
            cloneMail.setAddress("shenzhen"+i);
            cloneMail.setContent("java迭代更新");
            MailUtil.sendMail(cloneMail);
        }
        MailUtil.saveMail(mail);
    }
}
