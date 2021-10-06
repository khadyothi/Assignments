package com.sonata;

public class MyOwnAutoShop {
	
	public static void main(String[] args) {
		
		Sedan s1=new Sedan();
		s1.speed=20;
		s1.regularPrice=30000;
		s1.color="Green";
		s1.getSalePrice();
		s1.display();
		
		Ford f1=new Ford();
		
		f1.speed=60;
		f1.regularPrice=3000;
		f1.year=21;
		f1.color="Blue";
		f1.manufactureDiscount=20;
		f1.getSalePrice();
		f1.display();
		
		Car c1=new Car();
		c1.speed=80;
		c1.regularPrice=1000000;
		c1.color="Red";
	}

}
