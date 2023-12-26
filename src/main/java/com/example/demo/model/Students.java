package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="std_tbl")
public class Students {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String pass;
	private String city;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, String email, String pass, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", city=" + city + "]";
	}
}
	