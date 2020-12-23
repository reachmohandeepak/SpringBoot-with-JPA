package com.college.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	@GetMapping(value = "/allStudentDeatails")
	public String allStudentDeatails() {
		return "student"; 
	}
}