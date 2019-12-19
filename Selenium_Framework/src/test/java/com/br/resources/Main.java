package com.br.resources;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long pNum = (long)7702418906L;
		Employees chandra = new Employees("Chandra Maddireddy", "TechM", 32,pNum, 'M',10000);
		chandra.previousCompanyName = "";
		System.out.println( chandra.previousCompanyName);
//		chandra.updatePhoneNum(90529663695L);
		System.out.println(chandra.getPhoneNum());
		Student mama = new Student("Surya P",1234,"VI A",500);
		System.out.println("------------------Student details--------------");
		System.out.println("Name : " + mama.getName());
		System.out.println("Student : " + mama.getSID());
		System.out.println("Section : " + mama.getSection());	
		System.out.println("Total Marks : " + mama.getMarks());
		System.out.println("Grade : " + mama.getGrade());
		
		
		
	}


}
