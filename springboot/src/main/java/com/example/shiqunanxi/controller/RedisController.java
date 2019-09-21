package com.example.shiqunanxi.controller;

import com.example.shiqunanxi.controller.bean.Story;
import com.example.shiqunanxi.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class RedisController {

   @Autowired
   private  RedisService  redisService;

   @RequestMapping("/test")
   @ResponseBody
   public Map<String,Object> redis(@RequestParam("id") Long id){
       Map<String,Object> map=redisService.findById(id);
       return  map;
   }



}
