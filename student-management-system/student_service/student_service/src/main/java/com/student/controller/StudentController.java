package com.student.controller;

import com.student.entity.Student;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable("studentId") Long studentId) {

        Student student = this.studentService.getStudent(studentId);

        List courses = this.restTemplate.getForObject("http://course-service/course/student/" + student.getStudentId(), List.class);

        student.setCourses(courses);
        return student;

    }

}
