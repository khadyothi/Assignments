package com.sonata.ques2;

public class Student {
	
	private int StudentId;
	private String StudentName;
	private int marks;
	
	Student(){}
	public Student(int StudentId,String StudentName,int marks) {
		this.StudentId=StudentId;
		this.StudentName=StudentName;
		this.marks=marks;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
