package com.sonota.Interface;

public class Triangle extends Shapes {

	

	@Override
	public double Radious(int length,int width) {
	
		 double k=(length+height+width)/2;
		 double h=(1*2)*length*width;
		 double R=h/k;
		System.out.println("Radious="+R);
		return 0;
	}
	
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.length=20;
		t1.width=20;
		t1.height=10;
		t1.Radious(10,20);
		
	}

}
