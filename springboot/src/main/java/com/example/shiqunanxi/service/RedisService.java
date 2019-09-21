package com.example.shiqunanxi.service;

import com.example.shiqunanxi.controller.bean.Story;
import com.example.shiqunanxi.mapper.RedisMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class RedisService {

    @Autowired
    private  StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisMapper  redisMapper;
    public Map<String,Object> findById(@Param("id") Long id) {
        Map<String,Object> hashMap=new HashMap<>();
        Story s=redisMapper.findById(id);
//        redisTemplate.opsForValue().set("s",s);
        if(null!=s){
            hashMap.put("errorCode","200");
            hashMap.put("errorMsg",s);
            return hashMap;
        }
        hashMap.put("errorCode","500");
        hashMap.put("errorMsg","出错");
        return hashMap;
    }

    public Story findBy(long id) {
        Story s=redisMapper.findById(id);
        return s;
    }
}
