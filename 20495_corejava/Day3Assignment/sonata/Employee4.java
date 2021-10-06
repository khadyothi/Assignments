package com.sonata;

public class Employee4 {
	
	int EmployeeId;
    String EmpName;
	double EmpAdd;
	double BasicPay;
	int LeavesAvail;
	
	Employee4(){}
	
	public Employee4(int EmpId,String EmpName,double EmpAdd,double BasicSalary,int LeavesAvail) {
		
		
		this.EmployeeId=EmpId;
		this.EmpName=EmpName;
		this.EmpAdd=EmpAdd;
		this.BasicPay=BasicSalary;
		this.LeavesAvail=LeavesAvail;
	}
	
	
	public void ToString() {
		
		System.out.println("khadyothi");
	}

}
