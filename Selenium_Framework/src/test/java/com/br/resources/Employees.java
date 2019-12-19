package com.br.resources;

public class Employees {
	
	private String name;
	public String previousCompanyName;
	private int age;
	private long phoneNum;
	private float salary;
	private boolean isLaptopIssued;
	private char gender; 
	
	public Employees(String name,String previousCompanyName,int age,long phoneNum,char gender,float salary) {
		this(name,previousCompanyName,age,phoneNum,gender);
		this.salary = salary;
		
	}
	
	
	public Employees(String name,String previousCompanyName,int age,long phoneNum,char gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
		this.gender = gender;	
		this.previousCompanyName = previousCompanyName;
				
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getSalary() {
		return this.salary;
	}
	
	public int getAge() {
		return this.age;
	}
	public long getPhoneNum() {
		return this.phoneNum;
	}
	
	public void updatePhoneNum(long newPhnNum) {
		if(newPhnNum>=1e9 && newPhnNum <1e10) {
			this.phoneNum = newPhnNum;
		}else {
			System.out.println("Invalid Number");
		}
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void incrementAge() {
		++this.age;
	}
	
	public void incrementSalaryBy(int percentage) {
		this.salary = this.salary *(1+percentage/100);
	}

	public boolean isLaptopIssued() {
		return isLaptopIssued;
	}
	
	
}
