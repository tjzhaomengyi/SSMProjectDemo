package com.lanqiao.service;

import com.lanqiao.entity.Student;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/8/30 15:41
 * @Description:
 */
public interface StudentService {

    public void addStudent(Student student);

    public Student queryStudentByStuNo(int stuno);

}
