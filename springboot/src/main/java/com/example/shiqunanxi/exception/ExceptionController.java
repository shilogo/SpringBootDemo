package com.example.shiqunanxi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionController {

    @ResponseBody
    @ExceptionHandler({Exception.class})
    public Map<String,String> exceptionHandel(Exception ex, HttpServletRequest request){
          Map<String,String> map=new HashMap<>();
          map.put("errorCode","100");
          map.put("errorMsg",ex.getMessage());
          return  map;
    }

    @ResponseBody
    @ExceptionHandler({MyException.class})
    public Map<String,String> myexceptionHandel(MyException ex){
        Map<String,String> map=new HashMap<>();
        map.put("errorCode",ex.getErrorCode());
        map.put("errorMsg",ex.getErrorMsg());
        return  map;
    }
}
