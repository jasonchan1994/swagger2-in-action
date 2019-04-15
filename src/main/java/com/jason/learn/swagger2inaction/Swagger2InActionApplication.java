package com.jason.learn.swagger2inaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Swagger2InActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2InActionApplication.class, args);
	}

}
