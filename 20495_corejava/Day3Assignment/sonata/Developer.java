package com.sonata;

public class Developer extends Employee{
	
	Developer(){};
	Developer(int id, String name, double sal){
		super(id, name, sal);
	}
		public void salCal() {
			double hra=empSal/2;
			double da=(empSal*12)/100;
			double ta=(empSal*17)/100;
			System.out.println("hra="+hra);
			System.out.println("da="+da);
			System.out.println("Ta="+ta);
		}
		public static void main(String[] args) {
		Developer d1 = new Developer(20495, "Khadyothi", 200000);
		d1.display();		
		d1.salCal();
		}


}
