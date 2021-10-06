package com.sonata;


public class UserEmployee extends Employee {

	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEmpId(123);
		e1.setEmpName("khadyothi");
		e1.Tostring();
		e1.setSalary(23456);
		//e1.YearSalary();
		
		Employee e2=new Employee();
		e2.setEmpId(567);
		e2.setEmpName("Manichandana");
		e2.Tostring();
		e2.setSalary(1000);
		//e2.YearSalary();
		
		EmployeeImpl l1=new EmployeeImpl();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		
		System.out.println(l1.getEmployee());
		System.out.println(l1);
	}
}
