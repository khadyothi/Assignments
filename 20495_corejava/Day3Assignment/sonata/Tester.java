package com.sonata;

public class Tester extends Employee {
	
	Tester(){};
	Tester(int id, String name, double sal){
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
		Tester t1 = new Tester(20495, "Khadyothi", 133500);
		t1.display();
		t1.salCal();
		}

}
