package com.sonata;

import java.util.List;

public interface EmployeeInt {

	
	public void addEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public double YearSalary(Employee e1);
	public double appSalary(Employee e1);
	public List<Employee>getEmployee();
}
