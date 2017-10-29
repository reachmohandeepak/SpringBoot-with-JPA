package com.college.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollegeDataBaseController {

	@GetMapping(value = "/")
	public String getAllStudentDeatails() {
		return "index";
	}
}