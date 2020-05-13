/*
package com.example.zswb.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//邮箱发送
public class EmailSend {
    //邮件发送
    @Autowired
    private static JavaMailSenderImpl mailSender;
    static int i;
    public static Boolean send(String email) {

        //验证码发送
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("验证码");
        i = (int) (Math.random() * 100000);
        message.setText("您的验证码是" + i + "此验证码5分钟内有效");
        message.setTo(email);
        message.setFrom("958430327@qq.com");
        try {
            mailSender.send(message);
        } catch (Exception e) {
            return false;
        }
        return true;

    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        EmailSend.i = i;
    }
}*/
