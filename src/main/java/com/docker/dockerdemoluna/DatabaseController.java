package com.docker.dockerdemoluna;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/database")
public class DatabaseController {

    private final StudentService studentService;

    public DatabaseController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> DatabaseConnectTest(@RequestParam String name) {
        System.out.println("~Hello, Student Backend Test~");
        return studentService.getStudentByName(name);
    }

}
