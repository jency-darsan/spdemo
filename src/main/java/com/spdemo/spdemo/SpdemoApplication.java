package com.spdemo.spdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpdemoApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World! Your application is running";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpdemoApplication.class, args);
	}

}
