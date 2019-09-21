package com.example.shiqunanxi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class HelloController {

    private static final Logger log=LoggerFactory.getLogger(Logger.class);

    @RequestMapping("/index")
    public String index(@RequestParam("name") String name, @RequestParam("password") String password, Map<String,Object> map,Model model){
        if("张三".equals(name) && "123".equals(password)){
            model.addAttribute("name",name);
            return "main";
        }else {
            return "login";
        }
    }

    @RequestMapping("/allBooksManage")
    public String allBooksManage(Model model){
            return "allBooksManage";
    }
    @RequestMapping("/listALL")
    public String listAll(Model model){
        return "allBooksManage";
    }


//    @RequestMapping("/schedule")
//    @Scheduled(cron="0/5 * * * * ?")
//    public void schedule(){
//        System.out.println("定时开启》》》》》》》》》》"+ LocalDateTime.now());
//    }

}
