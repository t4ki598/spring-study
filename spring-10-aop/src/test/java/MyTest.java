import com.ldr.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-02-28 16:30
 * 创 建 人：t4ki
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
