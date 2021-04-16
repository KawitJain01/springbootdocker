package com.example.docker.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.boot.repo.MyEntity;
import com.example.boot.repo.MyRepo;
import com.example.controller.MyController;
import com.example.controller.MySecondController;

@SpringBootApplication
@ComponentScan(basePackageClasses = {MyController.class, MySecondController.class,
		MyEntity.class, MyRepo.class})
public class DockerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootApplication.class, args);
	}

}
