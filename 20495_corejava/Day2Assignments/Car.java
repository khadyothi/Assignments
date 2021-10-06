package com.sonata;

public class Car {
	
	int speed;
	double regularPrice;
	String color;
	static {
		System.out.println("Show the static block");
	}
	
	Car(){}
	Car(int speed,double regularPrice,String color){
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	public void getSalePrice() {
		
		System.out.println(regularPrice);
	}
	public void display()
	{
		System.out.println(speed);
		System.out.println(regularPrice);
		System.out.println(color);
	}

}
