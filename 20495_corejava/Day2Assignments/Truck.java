package com.sonata;

public class Truck extends Car{
	
	int weight;
	double discount;
	Truck(){}
	Truck(int s,double r,String c){
		super(s,r,c);
	}
	public void getSalePrice() {
		if(weight>2000)
		{
			discount=(0.1*regularPrice);
		}
		else
		{
		    discount=(0.2*regularPrice);
		}
		System.out.println(regularPrice-discount);
	}
	
//	public static void main(String[] args) {
//		
//		Truck t1=new Truck();
//		t1.weight=2000;
//		t1.speed=60;
//		t1.color="Red";
//	    t1.regularPrice=30000;
//	    t1.getSalePrice();
//	    t1.display();
//	}

}
