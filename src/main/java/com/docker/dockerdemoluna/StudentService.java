package com.docker.dockerdemoluna;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentByLike(String like){
        return studentRepository.findAll()
                .stream()
                .filter(Student -> Student.getLike().equals(like))
                .collect(Collectors.toList());
    }

}

