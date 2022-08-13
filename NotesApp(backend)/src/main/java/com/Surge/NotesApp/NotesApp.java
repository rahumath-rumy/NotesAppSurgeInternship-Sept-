package com.Surge.NotesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class NotesApp {

	public static void main(String[] args) {
		SpringApplication.run(NotesApp.class, args);
	}
	
	public static void greeting() {
		System.out.println("Welcome");
	}
}
