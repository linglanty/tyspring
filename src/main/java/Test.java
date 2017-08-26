import com.ty.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//读取bean.xml中的内容
        Person p = ctx.getBean("person",Person.class);//创建bean的引用对象
        System.out.println(p.toString());
    }

}
