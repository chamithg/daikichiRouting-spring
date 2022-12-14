package com.codingdojo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutingApplication.class, args);
	}
	@RequestMapping("")
	public String welcome() {
		return "Welcome";
		
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
		
	}
	@RequestMapping("/tomorrow")
	public String tommorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
		
	}

}
