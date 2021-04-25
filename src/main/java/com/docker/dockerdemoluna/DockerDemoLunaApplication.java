package com.docker.dockerdemoluna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoLunaApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Luna");
		SpringApplication.run(DockerDemoLunaApplication.class, args);
	}

}
