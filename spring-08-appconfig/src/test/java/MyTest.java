import com.ldr.config.UserConfig;
import com.ldr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-02-23 22:02
 * 创 建 人：t4ki
 */
public class MyTest {
    @Test
    public void test(){

        //使用实例化Spring容器AnnotationConfigApplicationContext
        //这种通用的ApplicationContext实现方式不仅可以接受@Configuration类作为输入，
        //还可以接受 普通@Component类和使用JSR-330元数据注释的类。

        //当@Configuration提供类作为输入时，
        // @Configuration该类本身将注册为Bean定义，
        // 并且@Bean该类中所有已声明的方法也将注册为Bean定义。
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user.getName());
    }
}
