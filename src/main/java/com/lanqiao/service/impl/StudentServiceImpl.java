package com.lanqiao.service.impl;

import com.lanqiao.entity.Student;
import com.lanqiao.mapper.StudentMapper;
import com.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/8/30 15:41
 * @Description:
 */

//@Service(value = "studentService")
//这一层使用配置文件注解的方式进行注入
public class StudentServiceImpl implements StudentService {
//Servie依赖于Dao(Mapper)
//    @Qualifier("studentMapper")
    StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void addStudent(Student student) {
    }

    @Override
    public Student queryStudentByStuNo(int stuno) {
        Student student =studentMapper.queryStudentByStuNo(stuno);

        return student;
    }
}
