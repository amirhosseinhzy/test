package com.cando.uni.service;

import com.cando.uni.model.Student;
import com.cando.uni.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class StuService {
    @Autowired
    private StudentRepository StudentRepository;

    public Student save(Student Student){
        Optional<Student> StudentData = StudentRepository.findById(Student.getId());
        if (StudentData.isPresent()){
            return StudentData.get();
        }
        return StudentRepository.save(Student);
    }
}
