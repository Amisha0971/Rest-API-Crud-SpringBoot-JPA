package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Students;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/add")
	public ResponseEntity<Students>addStudent(@RequestBody Students std){
		return new ResponseEntity<Students>(studentservice.addStudent(std),HttpStatus.CREATED)  ;
		
	}
	
	@GetMapping("/check")
	public ResponseEntity<List<Students>> getAllStudents(){
		return new ResponseEntity<List<Students>>(studentservice.getAllStudents(),HttpStatus.OK);
		
	}
	
	@PutMapping("/editStudent/{id}")
	public ResponseEntity<Students> updateStudent(@PathVariable(value="id") int id, @RequestBody Students std){
		return new ResponseEntity<Students>(studentservice.updateStudent(id, std),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable(value="id") int id){
		return new ResponseEntity<String>(studentservice.deleteStudent(id),HttpStatus.OK);
	
	}


}
