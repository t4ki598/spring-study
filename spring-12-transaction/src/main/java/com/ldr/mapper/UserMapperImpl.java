package com.ldr.mapper;

import com.ldr.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * 项目名称：spring-study
 * 类 名 称：UserMapperImpl
 * 类 描 述：TODO
 * 创建时间：2020-03-04 23:03
 * 创 建 人：t4ki
 */
public class UserMapperImpl implements UserMapper {

    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }

    //之前的mybatis所有操作，都使用sqlSession来执行
    //整合了Spring之后的所有操作，使用sqlSessionTemplate执行
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUser();
        return users;
    }

}
