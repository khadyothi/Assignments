package com.sonata;

public class Staff extends Employee4 {

	String Title;
	
	Staff(){}
	
	Staff(int EmpId,String EmpName,double EmpAdd,double BasicSalary,int leavesAvail ,String Title){
		super(EmpId,EmpName,EmpAdd,BasicSalary,leavesAvail);
		this.Title=Title;
	}
	
	public void calculateSalary() {
		double hra=(18/100)*BasicPay;
		double salary=BasicPay+hra;
		
		System.out.println("Salary="+salary);
	}
	
	@Override
	
     public void ToString() {
		
		System.out.println(EmployeeId);
		System.out.println(EmpName);
		System.out.println(EmpAdd);
		System.out.println(LeavesAvail);
		
		
	}

	
	
}
