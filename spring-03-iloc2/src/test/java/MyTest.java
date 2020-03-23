import com.ldr.pojo.ExampleBean;
import com.ldr.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-02-18 17:16
 * 创 建 人：t4ki
 */
public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("user");
        user.show();

        //用别名也能取出来
        ExampleBean bean = (ExampleBean)context.getBean("a");
        //ExampleBean bean = (ExampleBean)context.getBean("example");
        bean.show();

        ExampleBean bean1 = (ExampleBean)context.getBean("e1");
        //ExampleBean bean1 = (ExampleBean)context.getBean("example2");
        bean1.show();
    }
}
