package com.base;

public class CityBank {
public static void main(String[] args) {
	
	int a=100;
	do {
		System.out.println(a);
		a++;
	} while (a<10);
	
	for(int i=0;i<10;i++) {
		System.out.println(i);
	}
	
	for(int i=0;i<10;i++) {
		if (i==2) {
			break;
		}	
		System.out.println(i);
		}
		System.out.println("hi jack");
		
		for(int i=0;i<10;i++) {
			if (i==2) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Hi Jack");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++){
				System.out.println(j);
			}
			System.out.println(i);
			}
		
		
	
	/*
	String s="Welcome To Java Class";
	System.out.println(s);
	//Welcome To Java Class
	
	int s1 = s.length();
	System.out.println(s1);
	//21
	
	boolean empty=s.isEmpty();
	System.out.println(empty);
	//false
	
	char charAt=s.charAt(5);
	System.out.println(charAt);
	//m

	int indexOf = s.indexOf("c");
	System.out.println(indexOf);
	//3
	
	int indexOf2 = s.indexOf("z");
	System.out.println(indexOf2);
	//-1
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase );
	//WELCOME TO JAVA CLASS
	
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	//welcome to java class
	
	boolean startsWith = s.startsWith("Welcome");
	System.out.println(startsWith);
	//true
	
	boolean startsWith2 = s.startsWith("class");
	System.out.println(startsWith2);
	//false
	
	boolean endsWith = s.endsWith("Class");
	System.out.println(endsWith);
	//true
	
	boolean endsWith2 = s.endsWith("Welcome");
	System.out.println(endsWith2);
	//false
	
	String trim = s.trim();
	System.out.println(trim);
	//
	
	String substring = s.substring(7);
	System.out.println(substring);

	String substring2 = s.substring(0,7);
	System.out.println(substring2);
	
	String[] split = s.split("");
	for (String x : split) {
		System.out.println(x);
	}
	
	String[] split2 = s.split("To");
	for (String string : split) {
		System.out.println(string);
	}
	// Java Class
	
	System.out.println("******************");

	boolean contains = s.contains("e");
	System.out.println(contains);
	
	String replace = s.replace("e","7");
	System.out.println(replace);
	
	String replaceAll = s.replaceAll("Java","Selenium");
	System.out.println(replaceAll);
	
	String s2="Hi";
	System.out.println(s2);
	
	boolean equals = s.equals(s2);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
	System.out.println(equalsIgnoreCase);

	String concat = s2.concat(s);
	System.out.println(concat);

*/
	
}

}
