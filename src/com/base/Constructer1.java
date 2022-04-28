package com.base;

public class Constructer1 {
	public Constructer1(String name) {
		this ("Raja",8765);
		System.out.println("constructer2:"+name);
		
	}

	public Constructer1(String name, int id) {
		
		System.out.println("construer1:"+name+"\t"+id);
	}
	public Constructer1() {
		this("wins");
		System.out.println("constructer");
	}
	
}
