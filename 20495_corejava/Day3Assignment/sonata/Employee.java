package com.sonata;

public class Employee {
	
	
	int empId;
	String empName;
	double empSal;

	Employee() {}
	Employee(int id,String name,double sal){
		this.empId=id;
		this.empName=name;
		this.empSal=sal;
	}
	public void display() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}
	public void show() {
		System.out.println("My code");
	}
//	public static void main(String [] args) {
//		Employee e1=new Employee(123,"Khadyothi",2245);
//		e1.display();
//		Employee e2=new Employee();
//		e2.display();
//	}

}
