package com.Learning.demo;

import java.util.List;

public interface Employee_Service {
	
  public EmployeeDto getEmployee(Integer id);

  public List<EmployeeDto> getAllEmployee();

}
