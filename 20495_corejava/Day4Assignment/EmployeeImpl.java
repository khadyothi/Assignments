package com.sonata;

import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;


public class EmployeeImpl extends Employee implements EmployeeInt {
	List<Employee> l1=new LinkedList<>();
	
	@Override
	
	public void addEmployee(Employee e) {
		
		l1.add(e);
	}
	
	@Override
	public List<Employee> getEmployee(){
		//logic
		return null;
	}
	
	@Override
	public void deleteEmployee(Employee e) {
		
		
	}
	
	@Override
	public double YearSalary(Employee e1) {
		
		if(Salary==1000)
		{
			Salary=5000;
			System.out.println(Salary);
		}
		return 0;
	}
	
	public double appSalary(Employee e1) {
		return 0;
	}

}
