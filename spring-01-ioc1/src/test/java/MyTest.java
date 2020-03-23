import com.ldr.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        //用户实际调用的是业务层，dao层他们不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        //获取ApplicationContext : Spring配置容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserServiceImpl userService = (UserServiceImpl)context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
