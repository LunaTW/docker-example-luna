package com.docker.dockerdemoluna;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/health")
public class HealthController {

    private final StudentRepository studentRepository;

    public HealthController(StudentRepository studentRepository, StudentService studentService) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public String Health(){
        return "Hello, I am health! These are all Student List: " + studentRepository.getAllStudent();
    }

}

