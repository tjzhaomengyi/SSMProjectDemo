package com.lanqiao.main;

import com.lanqiao.service.StudentService;
import com.lanqiao.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFunc {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = ac.getBean("studentService",StudentService.class);
        System.out.println(studentService.queryStudentByStuNo(1));
        TestService testService = ac.getBean("testService",TestService.class);
        testService.tellService();
    }
}
