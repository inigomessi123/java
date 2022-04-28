package com.base;

import java.net.InterfaceAddress;

public class interfaceClass implements interfaceExample2 {

	@Override
	public void firstMethod() {
		System.out.println("First Method");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("Second Method");
		
		
	}

	@Override
	public void thirdMethod() {
		System.out.println("Third Method");
		
		}
	public static void main(String[] args) {
		interfaceClass a=new interfaceClass();
		a.firstMethod();
		a.secondMethod();
		a.thirdMethod();
	}

}
