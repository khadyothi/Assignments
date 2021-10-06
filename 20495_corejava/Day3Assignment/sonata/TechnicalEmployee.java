package com.sonata;

public class TechnicalEmployee extends Employee4 {
	
	double BasicPay;
	TechnicalEmployee(){}
	TechnicalEmployee(int EmpId,String EmpName,double EmpAdd,double BasicPay,int LeavesAvail){
		
		super(EmpId,EmpName,EmpAdd,BasicPay,LeavesAvail);
		
		this.BasicPay=BasicPay;
	}
	
	public void calculateSalary() {
		double hra=(12/100)*BasicPay;
		double salary=hra+BasicPay;
		System.out.println("Salary="+salary);
	}
	
	public void ToString() {
		
		System.out.println(EmployeeId);
		System.out.println(EmpName);
		System.out.println(EmpAdd);
		System.out.println(LeavesAvail);
	}

}