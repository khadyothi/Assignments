package com.sonata;

public class Student {
	int stdId;
	String stdName;
	int stdClass;
	Student(){}
	Student(int id, String name, int stdClass){
		this.stdId=id;
		this.stdName=name;
		this.stdClass=stdClass;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.stdId=1;
		s1.stdName="khadyothi";
		s1.stdClass=10;
		s1.display();
		Student s2=new Student(2,"Manichandana",10);
		s2.display();
	}
}
