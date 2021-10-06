package com.sonata;

public class UsingPeople extends Employee4 {
	
	public static void main(String args[]) {
	
		TechnicalEmployee t1=new TechnicalEmployee();
		t1.EmployeeId=1;
		t1.EmpName="khadyothi";
		t1.EmpAdd=123;
		t1.LeavesAvail=10;
		t1.BasicPay=30000;
		//t1.calculateSalary();
		t1.ToString();
		t1.calculateSalary();
		
		Staff s1=new Staff();
		s1.EmployeeId=2;
		s1.EmpName="Manichandana";
		s1.BasicPay=200000;
		s1.EmpAdd=123;
		s1.LeavesAvail=10;
		//s1.calculateSalary();
		s1.ToString();
		s1.calculateSalary();
		
	}

}
