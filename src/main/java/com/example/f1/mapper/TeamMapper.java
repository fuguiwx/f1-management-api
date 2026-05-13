package com.example.f1.mapper;

import com.example.f1.entity.Team;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface TeamMapper {

    @Select("SELECT * FROM team")
    List<Team> findAll();

    @Select("SELECT * FROM team WHERE id = #{id}")
    Team findById(Integer id);

    @Insert("INSERT INTO team(name, full_name, country, founded_year, championships, image, description) " +
            "VALUES(#{name}, #{fullName}, #{country}, #{foundedYear}, #{championships}, #{image}, #{description})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(Team team);

    @Update("UPDATE team SET name=#{name}, full_name=#{fullName}, country=#{country}, " +
            "founded_year=#{foundedYear}, championships=#{championships}, image=#{image}, description=#{description} " +
            "WHERE id=#{id}")
    int update(Team team);

    @Delete("DELETE FROM team WHERE id = #{id}")
    int delete(Integer id);
}