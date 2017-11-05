package com.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollegeDataBaseController {

	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	@GetMapping(value = "/allStudentDeatails")
	public String allStudentDeatails() {
		return "student"; 
	}
}