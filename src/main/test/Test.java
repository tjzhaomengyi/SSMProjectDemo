import com.lanqiao.service.StudentService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/8/30 15:10
 * @Description:
 */
public class Test {
    @Autowired
    SqlSessionFactoryBean sf;

//    @Qualifier(value="studentService")
//    StudentService studentService;

    @org.junit.Test
    public void testSpringAndMyBatis() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        StudentService studentService = ac.getBean("studentService",StudentService.class);
        System.out.println(studentService.queryStudentByStuNo(1));
    }
}
