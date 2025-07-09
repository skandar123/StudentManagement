package com.student.service;

import com.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    List<Student> list = List.of(
            new Student(101L, "Deep Das", "9923568911"),
            new Student(102L, "Riya Roy", "8976565434"),
            new Student(103L, "Seema Nair", "9786754631")
    );

    @Override
    public Student getStudent(Long id) {
        return list.stream().filter(student -> student.getStudentId().equals(id)).findAny().orElse(null);
    }
}
