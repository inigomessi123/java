package com.base;

public class Constructor {
public Constructor(String name) {
	System.out.println("Parametrized costructor:"+name);
	}
public Constructor(String name,int empId) {
	System.out.println("Parameterized constructor:"+name+"\t"+empId);
}
public Constructor() {
	System.out.println("Default constructor");
}
	public static void main(String[] args) {
		Constructor a=new Constructor();
		Constructor a1=new Constructor("Java");
		Constructor a2=new Constructor("Anjelina",98765);
	}



}
