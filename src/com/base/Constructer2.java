package com.base;

public class Constructer2 extends Constructer1 {
	public Constructer2(String name) {
		this("messi",9876);
		System.out.println("constructer1:"+name);
		
	}

	public Constructer2(String name, int id) {
			
		super();
		System.out.println("constructer2:"+name+"\t"+id);
	}
	public Constructer2() {
		this("jack");
		System.out.println("constructer");
	}
	public static void main(String[] args) {
		Constructer2 A=new Constructer2();
	}
}
