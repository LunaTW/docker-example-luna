package com.docker.dockerdemoluna;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health")
public class HealthController {
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String Health() {
        System.out.println("~Hello, Backend PASS~");
        return "Hello This is number 1";
    }
}
