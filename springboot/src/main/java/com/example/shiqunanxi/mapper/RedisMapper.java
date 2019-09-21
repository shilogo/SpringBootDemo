package com.example.shiqunanxi.mapper;

import com.example.shiqunanxi.controller.bean.Story;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RedisMapper {

    @Select("SELECT * FROM t_story WHERE id=#{id}")
    Story findById(@Param("id") Long id);
}
