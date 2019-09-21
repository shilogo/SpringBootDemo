package com.example.shiqunanxi.controller;

import com.example.shiqunanxi.controller.bean.Story;
import com.example.shiqunanxi.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    @Autowired
    private RedisService redisService;

    /**
     * Cacheable 加入缓存
     * @param id
     * @return
     */
    @RequestMapping("/able")
    public Story able(@RequestParam("id") Long id){
        return redisService.findBy(id);
    }

    /**
     * 删除缓存
     */
    @RequestMapping("/evitc")
    public void remove(@RequestParam("id") Long id){
         redisService.remove(id);
    }

    /**
     * 缓存:
     * Chcheable   ：插入缓存
     * ChcheEvict  ：删除缓存
     * chchePut    ：跟新缓存
     */
}
