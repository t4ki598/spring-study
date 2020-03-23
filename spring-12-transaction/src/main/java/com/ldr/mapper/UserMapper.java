package com.ldr.mapper;

import com.ldr.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 项目名称：spring-study
 * 类 名 称：UserMapper
 * 类 描 述：TODO
 * 创建时间：2020-03-04 21:12
 * 创 建 人：t4ki
 */
public interface UserMapper {

    List<User> getUser();

    int addUser(User user);

    int deleteUser(@Param("id") int id);
}
