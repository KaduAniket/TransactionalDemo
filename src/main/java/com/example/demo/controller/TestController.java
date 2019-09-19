package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	private TestService service;
	
	@PostMapping("/test")
	public String test(@RequestBody Student s) {
		
		service.saveStudent(s);
		
		return "Done";
	}
 
 

}
