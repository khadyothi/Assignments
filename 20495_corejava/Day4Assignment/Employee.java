package com.sonata;

public class Employee {
	
	int EmpId;
	String EmpName;
	double Salary;
	
	Employee(){}
	Employee(int EmpId, String EmpName,double Salary){
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.Salary=Salary;
	}
	
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
	public void Tostring() {
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(Salary);
	}

}
