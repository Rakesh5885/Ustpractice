package com.ust;

public class Calculator {
	
	public int add(int i1,int i2 ) {
		return i1+i2;
	}
	
	public double add(double d1, double d2) {
		return d1+d2;
	}
	
	public String add(String s1, String s2) {
		return s1+ s2;
	}
	
	public int add(int i1, int i2, int i3) {
		return i1+i2+i3;
		
	}
	
	public String add(String s1,String s2,String s3,String s4) {
		return s1+s2+s3+s4;
	}
	public double add(int i, double d) {
		return i+d;
	}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.add("a","b","c","d");
		System.out.println(c.add(3,4));
		System.out.println(c.add(78.90,56.76));
		System.out.println(c.add("Rakesh","R"));
		System.out.println(c.add(45,56.78));
		
	}
}
