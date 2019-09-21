package com.example.shiqunanxi.service;

import com.example.shiqunanxi.controller.bean.Story;
import com.example.shiqunanxi.mapper.RedisMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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

    //@Cacheable缓存key为story 的id 数据到缓存story 中,如果没有指定key则方法参数作为key保存到缓存中。
    @Cacheable(value = "story")
    public Story findBy(long id) {
        Story s=redisMapper.findById(id);
        System.out.println("为"+s.getId()+"数据做了缓存");
        return s;
    }

    //从缓存story中删除了key为id的缓存
    @CacheEvict(value = "story")
    public void remove(Long id) {
        System.out.println("删除了缓存"+id);
        //这里不做实际的删除
    }
}
