package com.example.easynotes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentDataBaseController {

	@GetMapping(value = "/")
	public String getAllStudentDeatails() {
		return "index";
	}
}