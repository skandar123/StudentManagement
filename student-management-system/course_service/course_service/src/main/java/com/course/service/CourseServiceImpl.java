package com.course.service;

import com.course.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list = List.of(
            new Course(1L, "12 weeks", "Databases", 101L),
            new Course(2L, "4 weeks", "Operating Systems", 101L),
            new Course(3L, "6 weeks", "Computer Networks", 102L),
            new Course(4L, "8 weeks", "Algorithms", 103L)
    );

    @Override
    public List<Course> getCoursesOfStudent(Long studentId) {
        return list.stream().filter(course -> course.getStudentId().equals(studentId)).collect(Collectors.toList());
    }
}
