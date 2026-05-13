package com.example.f1.mapper;

import com.example.f1.entity.Driver;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DriverMapper {
    @Select("SELECT * FROM driver")
    List<Driver> list();

    @Select("SELECT * FROM driver WHERE name=#{name}")
    Driver getByName(String name);

    @Insert("INSERT INTO driver(name,team,avatar,number,country,description) VALUES(#{name},#{team},#{avatar},#{number},#{country},#{description})")
    int add(Driver driver);

    // 🔥 修复：这里漏掉了 avatar！！！加上就好了
    @Update("UPDATE driver SET name=#{name},team=#{team},avatar=#{avatar},number=#{number},country=#{country},description=#{description} WHERE id=#{id}")
    int update(Driver driver);

    @Delete("DELETE FROM driver WHERE id=#{id}")
    int delete(Long id);
}