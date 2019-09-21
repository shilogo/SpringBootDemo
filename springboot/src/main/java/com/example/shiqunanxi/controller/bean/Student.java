package com.example.shiqunanxi.controller.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Size;
import java.util.List;
import java.util.Map;

/**
 * @ConfigurationProperties(prefix = "student")
 * @Value("${student.name}")
 */
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
//    @Value("${student.name}")
    private String name;
    private int age;
    private String address;
    private Map<String,Object> map;
    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}
