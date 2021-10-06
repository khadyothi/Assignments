package com.sonata.ques2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentDetails {
	
	public List<Student>getStudentInSort()
	{
		List<Student> students=new LinkedList<>();
		students.add(new Student(1,"Khadyothi",90));
		students.add(new Student(2,"Manichandana",80));
		students.add(new Student(3,"Chandana",60));
		Collections.sort(students,(o1,o2)->o1.getMarks().compareTo(o2.getMarks()));
		return students;
	}
	
	public static void main(String[] args) {
		List<Student> students=new StudentDetails().getStudentInSort();
		for(Student s:students) {
			System.out.println(s);
		}
	}
}
