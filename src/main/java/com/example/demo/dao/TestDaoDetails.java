package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;

@Component
public class TestDaoDetails {
	
	@Autowired
	private TestDao dao;
	
	public void saveStudent(Student s) {
		
		 dao.save(s);
	}
	

}
