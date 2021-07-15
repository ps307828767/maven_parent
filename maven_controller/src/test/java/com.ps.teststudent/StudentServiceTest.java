package com.ps.teststudent;

import com.ps.model.Student;
import com.ps.service.StudentService;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Date 2021/7/13 11:31
 * @Created by ps
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class StudentServiceTest  {
    @Resource
    private StudentService studentService;
    @Test
    public void addTest() throws Exception {
        Student student=new Student();
        student.setId(new Integer("1"));
        student.setName("张同学");
        student.setSex(1);
        student.setAddress("西安长安区");
        System.out.println(studentService.addStudent(student));
    }
    @Test
    public void deleteTest()throws Exception{
        System.out.println(studentService.deleteStudentById(1));

    }
    @Test
    public void updateTest()throws Exception{
        Student student=new Student();
        student.setId(new Integer("4"));
        student.setAddress("台湾");
        System.out.println(studentService.updateStudentById(student));
    }
    @Test
    public void select()throws Exception{
//        Student student=new Student();
//        student.setId(new Integer("1"));
        List<Student> list=studentService.findAllStudent(null);
        for (Student s:list){
            System.out.println(s.toString());
        }

    }
}
