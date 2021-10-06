package com.sonata;


public class Sedan extends Car{
	
	int length;
	double discount;
	Sedan(){}
	Sedan(int s,double r,String c){
		super(s,r,c);
	}
	public void getSalePrice(int length) {
		if(length>20)
		{
			discount=(0.05)*regularPrice;
		}
		else 
		{
			discount=(0.1)*regularPrice;
		}
		
		System.out.println("Discount"+discount);
		
	}
	
}

