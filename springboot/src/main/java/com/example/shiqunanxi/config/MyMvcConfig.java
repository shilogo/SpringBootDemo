package com.example.shiqunanxi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 扩展SpringMvc功能
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //发送hello请求到hello页面
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login.html").setViewName("login");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHandler()).addPathPatterns("/**").excludePathPatterns("/index","/hello");
//    }

    /**
     *  置生效，加入到spronboo
     * @return
     */
    @Bean
    public MyLocaleResolver  mylocaleresolver(){
        return  new MyLocaleResolver();
    }

}
