package com.sonata;

public class Ford extends Car {

	int year;
	int manufactureDiscount;
	int cost;
	Ford(){}
	Ford(int s,double r,String c){
		super(s,r,c);
	}
	public void getSalePrice() {
		System.out.println(regularPrice-manufactureDiscount);
	}
	public void dispaly() {
		System.out.println(year);
	}
	
	
}
