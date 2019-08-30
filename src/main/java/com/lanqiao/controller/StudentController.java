package com.lanqiao.controller;

import com.lanqiao.entity.Student;
import com.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;


/**
 * @Auther: zhaomengyi
 * @Date: 2019/8/30 15:44
 * @Description:
 */

@RequestMapping("controller")
@Controller("studentController")
public class StudentController {

    //控制器依赖于Service
    @Qualifier(value = "studentService")
    StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("queryStudentByStuNo/{stuno}")
    public String queryStudentByStuNo(@PathVariable("stuno") Integer stuNo, Map<String,Object> map){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        StudentService st = ac.getBean("studentService",StudentService.class);
        Student student = studentService.queryStudentByStuNo(stuNo);
        studentService.getClass();
        System.out.println(student);
        map.put("student",student);
        return "result";
    }
}
