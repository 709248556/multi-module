package com.example.webchat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"serviceImpl", "com.example.webchat"})
@MapperScan("dao")
public class WebchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebchatApplication.class, args);
	}
}
