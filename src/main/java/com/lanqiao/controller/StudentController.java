package com.lanqiao.controller;

import com.lanqiao.entity.Student;
import com.lanqiao.service.StudentService;
import com.lanqiao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.Map;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/8/30 15:44
 * @Description:
 */

@Controller
@RequestMapping("controller")
public class StudentController {

    //控制器依赖于Service
    @Resource(name = "studentService")
    StudentService studentService;

    @Autowired
    TestService testService;

//    public void setStudentService(StudentService studentService) {
//        this.studentService = studentService;
//    }

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

    @RequestMapping("testService")
    public void testService(){
        testService.tellService();
    }
}

