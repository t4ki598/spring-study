package com.ldr.mapper;

import com.ldr.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * 项目名称：spring-study
 * 类 名 称：UserMapperImpl2
 * 类 描 述：TODO
 * 创建时间：2020-03-05 10:06
 * 创 建 人：t4ki
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
