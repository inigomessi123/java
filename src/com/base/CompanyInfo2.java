package com.base;

public class CompanyInfo2 {

	public CompanyInfo2(String name) {
		this("Raja",987654);
		System.out.println("Parent Parameterized Constructor1:"+name);
	}
		
	public CompanyInfo2(String name, int empId) {
		System.out.println("Parent Parameterized constructor2:"+name+"\t"+empId);
	}
	public CompanyInfo2() {
		this("Messi");
		System.out.println("Parent Default Constructor");
	}

}
