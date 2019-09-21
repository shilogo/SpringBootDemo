package com.example.shiqunanxi;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

public class ScheduleTest {


    @RequestMapping("/schedule")
    @Scheduled(cron="0/5* * * * ?")
    public void schedule(){
        System.out.println("定时开启》》》》》》》》》》"+ LocalDateTime.now());
    }
}
