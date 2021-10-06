package com.sonata;

public class Product {
	
	int proId;
	String proName;
	double proPrice;
	
	Product(){}
	
	Product(int id,String name,double price){
		this.proId=id;
		this.proName=name;
		this.proPrice=price;
	}
	public void CalGst(double price) {
		
		this.proPrice=this.proPrice+price;
		System.out.println(proPrice);
	}
	
	public void dispaly() {
		System.out.println(proId);
		System.out.println(proName);
		System.out.println(proPrice);
	}
	
	public static void main(String [] args) {
		Product p1=new Product();
		p1.proId=1;
		p1.proName="gfd";
		//p1.proPrice=100;
		p1.dispaly();
	}
}
