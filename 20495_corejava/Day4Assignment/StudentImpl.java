package com.sonata.ques2;

import java.util.LinkedList;
import java.util.List;

public class StudentImpl extends Student{
	
	List<Student> l1=new LinkedList<>();
	
	public void addStudent(Student e) {
		
		l1.add(e);
	}
	
	

}
