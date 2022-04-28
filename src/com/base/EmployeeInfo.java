package com.base;

public class EmployeeInfo extends CompanyInfo2 {
	public EmployeeInfo(String name) {
		this("inigo",987654);
		System.out.println("Child Parameterized Constructor1:"+name);
	}
	public EmployeeInfo(String name, int empId) {
		System.out.println("Child Parameterized constructor2:"+name+"\t"+empId);
	}
	public EmployeeInfo() {
		this("jack");
		System.out.println("Child Default Constructor");
	}
	public static void main(String[] args) {
		EmployeeInfo e=new EmployeeInfo();
	}

}
