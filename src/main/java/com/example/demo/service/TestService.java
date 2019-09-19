package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.TestDaoDetails;
import com.example.demo.model.Student;

@Service
@Transactional
public class TestService {
	
	@Autowired
	private TestDaoDetails details;
	
	public void saveStudent(Student s) {
		
		//Student s = new Student(Long.parseLong("101"), "Sujata", "9021834301");
		
		details.saveStudent(s);
	}

}
