package com.Learning.demo;

public class EmployeeDto {
	
	private Integer employee_ID;
	private String name;
	private String email_ID;
	private String last_name;
	

	public Integer getEmployee_ID() {
		return employee_ID;
	}
	public void setEmployee_ID(Integer employee_ID) {
		this.employee_ID = employee_ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_ID() {
		return email_ID;
	}
	public void setEmail_ID(String email_ID) {
		this.email_ID = email_ID;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	@Override
	public String toString() {
		return "EmployeeDto [employee_ID=" + employee_ID + ", name=" + name + ", email_ID=" + email_ID + ", last_name="
				+ last_name + "]";
	}
	

}
