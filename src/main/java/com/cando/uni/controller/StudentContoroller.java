package com.cando.uni.controller;

import com.cando.uni.model.Student;
import com.cando.uni.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentContoroller {
    @Autowired
    private StuService studentService;
    @PostMapping
    public Student save(@RequestBody Student Student){
        return studentService.save(Student);
    }
}
