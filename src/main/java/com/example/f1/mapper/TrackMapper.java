package com.example.f1.mapper;

import com.example.f1.entity.Track;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface TrackMapper {
    @Select("SELECT * FROM track")
    List<Track> list();

    @Select("SELECT * FROM track WHERE name=#{name}")
    Track getByName(String name);

    @Insert("INSERT INTO track(name,location,length,lap,image,description) VALUES(#{name},#{location},#{length},#{lap},#{image},#{description})")
    int add(Track track);

    @Update("UPDATE track SET name=#{name},location=#{location},length=#{length},lap=#{lap},image=#{image},description=#{description} WHERE id=#{id}")
    int update(Track track);

    @Delete("DELETE FROM track WHERE id=#{id}")
    int delete(Long id);
}