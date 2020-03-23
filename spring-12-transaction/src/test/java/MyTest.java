import com.ldr.mapper.UserMapper;
import com.ldr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-03-05 10:37
 * 创 建 人：t4ki
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.getUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    //声明式事务测试
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);

        mapper.addUser(new User(5, "x", "345234"));
        mapper.deleteUser(5);

        List<User> userList = mapper.getUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
