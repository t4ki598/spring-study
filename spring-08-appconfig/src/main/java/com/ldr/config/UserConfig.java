package com.ldr.config;

import com.ldr.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 项目名称：spring-study
 * 类 名 称：UserConfig
 * 类 描 述：TODO
 * 创建时间：2020-02-23 22:03
 * 创 建 人：t4ki
 */

@Configuration
public class UserConfig {

    @Bean
    //使用@Bean标记一个返回javabean的方法，返回的javabean作为bean注册到beans中。
    //等效于XML配置文件的"
    // <beans>
    //    <bean id="user" class="com.ldr.pojo.UserConfig"/>
    //</beans>
    public User getUser(){
        return new User();
    }
}
