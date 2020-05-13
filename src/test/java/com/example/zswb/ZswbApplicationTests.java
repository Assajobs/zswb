package com.example.zswb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class ZswbApplicationTests {
    @Autowired
    private DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println("数据源>>>>>>" + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("连接>>>>>>>>>" + connection);
        System.out.println("连接地址>>>>>" + connection.getMetaData().getURL());
        connection.close();



    }
    @Autowired
   JavaMailSenderImpl mailSender;

    @Test
    public void email(){
        //邮件设置1：一个简单的邮件
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("hhhh");
        message.setText("今晚7:30开会");
        message.setTo("958430327@qq.com");
        message.setFrom("958430327@qq.com");
        mailSender.send(message);
    }


    /**
     * 测试redis
     */

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
         redisTemplate.opsForValue().set("ee","hh");
        System.out.println((redisTemplate.opsForValue().get("ee")));
    }

}
