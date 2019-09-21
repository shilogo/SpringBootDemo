package com.example.shiqunanxi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MailTest {
    @Autowired
    private JavaMailSenderImpl mailSender;

    @Test
    public void test(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("通知开会");
        simpleMailMessage.setText("今晚7:30在教师楼开会");
        simpleMailMessage.setTo("1160469255@qq.com");
        simpleMailMessage.setFrom("shilogo@163.com");
        mailSender.send(simpleMailMessage);
    }

}
