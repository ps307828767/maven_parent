package com.ps.model;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2021/7/13 11:15
 * @Created by ps
 */
@Table(name = "test.t_student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;//id
    private String name;//姓名
    private Integer sex;//性别
    private String address;//地址

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student : id:" + this.id + " name:" + this.name + " sex:" + this.sex + " address:" + this.address;
    }
}
