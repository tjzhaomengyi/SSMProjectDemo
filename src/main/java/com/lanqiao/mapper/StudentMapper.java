package com.lanqiao.mapper;

import com.lanqiao.entity.Student;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/8/30 14:57
 * @Description:
 */
public interface StudentMapper {

    public void addStudent(Student student);

    public Student queryStudentByStuNo(int stuno);
}
