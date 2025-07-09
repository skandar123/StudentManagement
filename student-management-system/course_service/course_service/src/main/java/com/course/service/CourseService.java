package com.course.service;

import com.course.entity.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCoursesOfStudent(Long studentId);

}
