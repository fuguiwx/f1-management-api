package com.example.f1.mapper;

import com.example.f1.entity.Discuss;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface DiscussMapper {

    @Select("select * from discuss")
    List<Discuss> list();

    @Select("select * from discuss where id = #{id}")
    Discuss getById(Long id);

    @Insert("insert into discuss(title,description,cover_image,author,publish_time) values(#{title},#{description},#{coverImage},#{author},NOW())")
    int add(Discuss discuss);

    @Update("update discuss set title=#{title},description=#{description},cover_image=#{coverImage},author=#{author},publish_time=#{publishTime} where id=#{id}")
    int update(Discuss discuss);

    @Delete("delete from discuss where id=#{id}")
    int delete(Long id);
}