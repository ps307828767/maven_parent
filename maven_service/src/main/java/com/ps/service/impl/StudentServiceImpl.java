package com.ps.service.impl;

import com.ps.dao.StudentDao;
import com.ps.model.Student;
import com.ps.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Date 2021/7/13 11:31
 * @Created by ps
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    public Integer addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Integer deleteStudentById(Integer id) {
        Student student=new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public Integer updateStudentById(Student student) {
        return studentDao.update(student);
    }

    public List<Student> findAllStudent(Student student) {
        return studentDao.select(student);
    }

}
