package com.asminds.spring.model;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

@Entity
public class StudentPojo {
	/*@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int id;*/
	@Column
	String studname;
	@Column
	String mobileno;
	@Column
	String location;
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	/*	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	*/
	public StudentPojo(String studname, String mobileno, String location) {
		super();
		//this.id = id;
		this.studname = studname;
		this.mobileno = mobileno;
		this.location = location;
	}
	public StudentPojo() {
		super();
	}
}
