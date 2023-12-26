package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Students;


public interface StudentRepository extends JpaRepository<Students, Integer>{

}
