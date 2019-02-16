import com.zrgj.entity.Student;
import com.zrgj.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2019/2/2 0002.
 */
public class TestUser {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        StudentService o = (StudentService) ctx.getBean("StudentService");
        List<Student> students = o.selectAll();
        System.out.println(students);
    }
}