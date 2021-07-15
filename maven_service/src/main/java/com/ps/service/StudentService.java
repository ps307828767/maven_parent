package com.ps.service;

import com.ps.model.Student;

import java.util.List;

/**
 * @Classname StudentService
 * @Description TODO
 * @Date 2021/7/13 11:25
 * @Created by ps
 */
public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    Integer addStudent(Student student);

    /**
     * 根据ID删除学生
     * @param id
     * @return
     */
    Integer deleteStudentById(Integer id);

    /**
     * 根据ID修改学生信息
     * @param student
     * @return
     */
    Integer updateStudentById(Student student);

    /**
     * 按条件查找所有学生
     * @param student
     * @return
     */
    List<Student> findAllStudent(Student student);

}
