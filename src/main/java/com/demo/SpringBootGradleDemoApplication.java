package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@SpringBootApplication

@EnableSwagger2
//dev2 updated in remote
public class SpringBootGradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleDemoApplication.class, args);
		System.out.println("hello world");
		System.out.println("hello to universe");
	}
	// it is a gradle prject to demo and learn

}
