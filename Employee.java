package com.Learning.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {  //plain old java object (pojo)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;
	
	private String name;
	private String email_id;
	private String last_name;
	

	public Integer getEmployee_ID() {
		return employee_id;
	}
	public void setEmployee_ID(Integer employee_ID) {
		this.employee_id = employee_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_ID() {
		return email_id;
	}
	public void setEmail_ID(String email_ID) {
		this.email_id = email_ID;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		return "Employee [employee_ID=" + employee_id + ", name=" + name + ", email_ID=" + email_id + ", last_name="
				+ last_name + "]";
	}
	
}
