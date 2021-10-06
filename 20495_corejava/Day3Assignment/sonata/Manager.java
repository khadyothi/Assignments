package com.sonata;

public class Manager extends Employee{
	
	Manager(){};
	Manager(int id, String name, double sal){
		super(id, name, sal);
	}
		public void salCal() {
			double hra=empSal/2;
			double da=(empSal*12)/100;
			double ta=(empSal*17)/100;
			System.out.println("hra="+hra);
			System.out.println("da="+da);
			System.out.println("ta="+ta);
		}
		public static void main(String[] args) {
		Manager m1 = new Manager(20495, "Khadyothi", 133000);
		m1.display();
		m1.salCal();
		}


}
