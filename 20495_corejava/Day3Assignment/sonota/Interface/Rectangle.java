package com.sonota.Interface;

public class Rectangle extends Shapes{
	
	Rectangle(){}
	Rectangle(int length , int height,int width){

		super(length,height,width);
		
	}
	
	@Override
	
	public double Radious(int length,int width) {
	
		 double R=2*(length*width);
		System.out.println("Radious="+R);
		return 0;
	}
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.length=20;
		r1.height=20;
		r1.width=10;
		r1.Radious(10, 20);
	}
	

}
