import com.ldr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-02-23 21:25
 * 创 建 人：t4ki
 */
public class MyTest {
    @Test
    public void myTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.getName() );
    }
}
