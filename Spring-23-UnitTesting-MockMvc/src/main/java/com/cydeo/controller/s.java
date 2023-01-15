package com.cydeo.controller;

import com.cydeo.entity.Student;
import com.cydeo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class s {

    private final StudentService studentService;

    public s(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Mike", "Smith", 20);
    }

    @GetMapping("/service/student")
    public List<Student> getStudent_Service() {
        return studentService.getStudent();
    }

}
