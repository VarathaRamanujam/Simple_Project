package com.Learning.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/payilagam")
public class EmployeeController {
	
	@Autowired
	private Employee_Service obj ;
	@GetMapping(value="/getEmployee/{employeeID}")
	
	public ResponseEntity<EmployeeDto> getting( @PathVariable Integer employee){
	   EmployeeDto dto =	obj.getEmployee(employee);
	   System.out.println(dto);
	   return new ResponseEntity<EmployeeDto>(dto,HttpStatus.OK);
	}

}
