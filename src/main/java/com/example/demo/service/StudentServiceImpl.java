package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Students;
import com.example.demo.repo.StudentRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public Students addStudent(Students std) {
		
		return studentrepo.save(std);
	}

	@Override
	public List<Students> getAllStudents() {
		
		return studentrepo.findAll();
	}

	@Override
	public Students updateStudent(int id, Students std) {
		std.setId(id);
		return studentrepo.save(std) ;
	}

	@Override
	public String deleteStudent(int id) {
		java.util.Optional<Students>std=studentrepo.findById(id);
		if(std.get()!=null) {
			studentrepo.delete(std.get());
			return "Delete Successfully";
			
		}
		
		return "Student not available" + id +"id";
	}

}
