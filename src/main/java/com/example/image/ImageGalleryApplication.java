package com.example.image;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ImageGalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageGalleryApplication.class, args);
	}

	@Bean
	Path path(){
		return Paths.get(System.getProperty("java.io.tmpdir"));
	}
	
	@Bean
	PasswordEncoder getEncoder() {
		return new BCryptPasswordEncoder();
	}
}
