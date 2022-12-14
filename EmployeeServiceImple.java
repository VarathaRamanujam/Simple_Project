package com.Learning.demo;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value="employeeService")

@Transactional
public class EmployeeServiceImple implements Employee_Service {

	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public EmployeeDto getEmployee(Integer id) {
		
		EmployeeDto emp = new EmployeeDto();
		
		Optional<Employee> opt=empRepo.findById(id);
		Employee employee =opt.orElseThrow(null);
		
		emp.setEmployee_ID(employee.getEmployee_ID());
		emp.setEmail_ID(employee.getEmail_ID());
		emp.setName(employee.getName());
		emp.setLast_name(employee.getLast_name());
		return emp;
		
	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		return null;
	}

	

}
