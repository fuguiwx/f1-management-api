package com.example.f1.mapper;

import com.example.f1.entity.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> list();

    @Insert("INSERT INTO user(openid,nickname,avatar) VALUES(#{openid},#{nickname},#{avatar})")
    int add(User user);

    @Update("UPDATE user SET nickname=#{nickname},avatar=#{avatar} WHERE id=#{id}")
    int update(User user);

    @Delete("DELETE FROM user WHERE id=#{id}")
    int delete(Long id);
}