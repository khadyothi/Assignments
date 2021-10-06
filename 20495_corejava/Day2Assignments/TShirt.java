package com.sonata;

public class TShirt {
	
	String color;
	String material;
	String design;
	
	TShirt(){}
	
	TShirt(String color, String material,String design){
		
		this.color=color;
		this.material=material;
		this.design=design;
	}
	
	public void small(String size) {
		System.out.println(size);
	}
	public void large(String size) {
		System.out.println(size);
	}
	public void medium(String size) {
		System.out.println(size);
	}
	
	public void display() {
		System.out.println(color);
		System.out.println(material);
		System.out.println(design);
	}
	
	public static void main(String [] args) {
		TShirt t1=new TShirt();
		t1.color="RED";
		t1.material="Cotton";
		t1.design="hgf";
		t1.small("Small");
		t1.display();
		
		TShirt t2=new TShirt();
		t2.color="Blue";
		t2.material="Cotton";
		t2.design="gjgjf";
		t2.large("Large");
		t2.display();
		
		TShirt t3=new TShirt();
		t3.color="Green";
		t3.material="Cotton";
		t3.design="gfds";
		t3.medium("Medium");
		t3.display();
	}

}
