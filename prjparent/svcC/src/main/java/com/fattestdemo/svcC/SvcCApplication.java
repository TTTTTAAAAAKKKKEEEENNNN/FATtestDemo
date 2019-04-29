package com.dubbotest.svcC;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableDubbo
@SpringBootApplication
public class SvcCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcCApplication.class, args);
	}

}
