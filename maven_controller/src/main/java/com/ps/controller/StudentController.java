package com.ps.controller;

import com.ps.model.Student;
import com.ps.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname StudentController
 * @Description TODO
 * @Date 2021/7/13 14:56
 * @Created by ps
 */
@RestController
@RequestMapping("/studentApi/")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("findAllStudentInfo")
    public List<Student> findAllStudentInfo(@RequestParam("id") String id) {
        Student student = new Student();
        //在此我就不做过多验证判断
        if ("0".equals(id)) {
            student = null;
        } else {
            student.setId(new Integer(id));
        }
        List<Student> all=studentService.findAllStudent(student);
        return all;
    }
}
