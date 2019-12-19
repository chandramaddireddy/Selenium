package com.br.resources;

public class Student {
	private String name;
	private int sID;
	private String section;
	private int marks;
	private char grade;
	public Student(String name,int sID,String section,int marks) {
		this.name = name;
		this.sID = sID;
		this.section = section;
		this.marks = marks;
	}
	public String getName() {
		return this.name;
	}
	public int getSID() {
		return this.sID;
	}
	public String getSection() {
		return this.section;
	}
	public int getMarks() {
		return this.marks;
	}
	public char getGrade() {
		if (this.marks < 300) {
			return 'C';
		}else if(this.marks >= 300 && this.marks <= 360) {
			 return 'B';
		}else  
			return (char)65;
			
		
	}

}
