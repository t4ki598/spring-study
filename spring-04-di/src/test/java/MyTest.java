import com.ldr.pojo.Student;
import com.ldr.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-02-19 15:33
 * 创 建 人：t4ki
 */
public class MyTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void userTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User)context.getBean("user");
        System.out.println(user.toString());

        User user1 = (User)context.getBean("user1");
        System.out.println(user1.toString());


        //原型模式中，每次从容器中get的时候都会产生新的对象
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user2", User.class);
        System.out.println(user2 == user3);
    }

}
