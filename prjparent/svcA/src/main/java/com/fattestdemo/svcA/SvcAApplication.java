package com.dubbotest.svcA;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableDubbo
@SpringBootApplication
@ServletComponentScan
public class SvcAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcAApplication.class, args);
	}

}
