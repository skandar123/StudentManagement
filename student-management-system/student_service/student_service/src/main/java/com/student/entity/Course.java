package com.student.entity;

public class Course {

    private Long cId;
    private String duration;
    private String courseName;
    private Long studentId;

    public Course(Long cId, String duration, String courseName, Long studentId) {
        this.cId = cId;
        this.duration = duration;
        this.courseName = courseName;
        this.studentId = studentId;
    }

    public Course() {


    }

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}

