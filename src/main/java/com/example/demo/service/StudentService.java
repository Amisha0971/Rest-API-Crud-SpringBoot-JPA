package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Students;

public interface StudentService {
	
	public Students addStudent(Students std);
	
	public List<Students> getAllStudents();
	
	public Students updateStudent(int id,Students std);
	
	public String deleteStudent(int id);

}
