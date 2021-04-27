package com.docker.dockerdemoluna;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentByName(String name){
        return studentRepository.findAll()
                .stream()
                .filter(Student -> Student.getName().equals(name))
                .collect(Collectors.toList());
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

}

