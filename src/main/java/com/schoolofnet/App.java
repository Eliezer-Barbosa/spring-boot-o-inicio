package com.schoolofnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // sem essa annotation o servidor não sobe
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
