package com.cando.uni.service;

import com.cando.uni.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TecService {
    @Autowired
    private com.cando.uni.repository.TeacherRepository TeacherRepository;

    public Teacher save(Teacher Teacher){
        Optional<Teacher> TechDate = TeacherRepository.findById(Teacher.getId());
        if (TechDate.isPresent()){
            return TechDate.get();
        }
        return TeacherRepository.save(Teacher);
    }
}
