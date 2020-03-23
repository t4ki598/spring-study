import com.ldr.mapper.UserMapper;
import com.ldr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-03-04 21:55
 * 创 建 人：t4ki
 */
public class MyTest {
    @Test
    public void test1() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        List<User> users = userMapper.getUser();
        for (User user : users) {
            System.out.println(user);
        }

    }
}
