import com.ty.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");//��ȡbean.xml�е�����
        Person p = ctx.getBean("person",Person.class);//����bean�����ö���
        System.out.println(p.toString());
    }

}
