package com.example.shiqunanxi;

import com.example.shiqunanxi.config.RedisUtils;
import com.example.shiqunanxi.controller.bean.Story;
import com.example.shiqunanxi.controller.bean.Student;
import com.example.shiqunanxi.service.RedisService;
import net.bytebuddy.asm.Advice;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

   private static final Logger log=LoggerFactory.getLogger(Logger.class);

    @Autowired
    Student student;
    @Autowired
   private  RedisService  redisService;
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
        System.out.println(student);
    }

    @Test
    public void contextLog(){
        //日志级别由低到高
        log.trace("tt");
        log.debug("dd");
        log.info("hh");
        log.warn("ww");
        log.error("ee");
    }

    @Autowired
    private RedisUtils redisutils;

    @Test
    public void set(){
        redisutils.set("redis_key","rdis_value");
    }

    @Test
    public void get(){
        String value=redisutils.get("6");
        System.out.println(value);
    }

    @Test
    public void setRedis(){
        Story story=redisService.findBy(49l);
        System.out.println(story.toString());
        redisTemplate.opsForValue().set("s",story.toString());
        Object ss=redisTemplate.opsForValue().get(story);
        System.out.println(ss);
    }


    @Test
    public void delete(){
        redisutils.delete("6");
    }
}
