import com.ldr.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 项目名称：spring-study
 * 类 名 称：MyTest
 * 类 描 述：TODO
 * 创建时间：2020-02-23 20:22
 * 创 建 人：t4ki
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        person.getDog().say();
        person.getCat().say();
    }
}
