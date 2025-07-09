package com.student.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Long studentId;
    private String name;
    private String phone;

    List<Course> courses=new ArrayList<>();

    public Student(Long studentId, String name, String phone, List<Course> courses) {
        this.studentId = studentId;
        this.name = name;
        this.phone = phone;
        this.courses = courses;
    }


    public Student(Long studentId, String name, String phone) {
        this.studentId = studentId;
        this.name = name;
        this.phone = phone;
    }

    public Student() {
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
