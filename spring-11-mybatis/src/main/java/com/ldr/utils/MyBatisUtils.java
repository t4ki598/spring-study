package com.ldr.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 项目名称：spring-study
 * 类 名 称：MyBatisUtils
 * 类 描 述：TODO
 * 创建时间：2020-03-04 22:04
 * 创 建 人：t4ki
 */
public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            //第一步
            //使用Mybatis获取sqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    //既然有了 SqlSessionFactory，我们就可以从中获得 SqlSession 的实例了。
    // SqlSession 完全包含了面向数据库执行 SQL 命令所需的所有方法。
    // 你可以通过 SqlSession 实例来直接执行已映射的 SQL 语句。

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
