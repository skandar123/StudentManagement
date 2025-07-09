package com.course.controller;

import com.course.entity.Course;
import com.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @RequestMapping("/student/{studentId}")
    public List<Course> getCourses(@PathVariable("studentId") Long studentId) {
        return this.courseService.getCoursesOfStudent(studentId);
    }

}
