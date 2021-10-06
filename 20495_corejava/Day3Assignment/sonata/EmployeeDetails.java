package com.sonata;

public class EmployeeDetails {

	
	public static void main(String[] args) {
		Address a1=new Address(123,"Nellore","Andhra pradesh",543211);
		a1.toString();
		
		
		TechnicalEmployee t1=new TechnicalEmployee(123,"khadyothi",120 ,200000,40);
		t1.ToString();
		
		Staff s1=new Staff(234,"Manichandana",120,2000000,40,"clerk");
		s1.ToString();
		
	}
}
