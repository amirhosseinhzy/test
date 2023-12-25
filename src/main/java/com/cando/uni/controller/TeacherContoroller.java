package com.cando.uni.controller;

import com.cando.uni.model.Student;
import com.cando.uni.model.Teacher;
import com.cando.uni.service.StuService;
import com.cando.uni.service.TecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherContoroller {
    @Autowired
    private TecService TeacherServic;
    @PostMapping
    public Teacher save(@RequestBody Teacher Teacher){
        return TeacherServic.save(Teacher);
    }
}
