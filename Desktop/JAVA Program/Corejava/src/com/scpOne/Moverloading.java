package com.scpOne;

public class Moverloading {
	static int i=0;
	static char c='a';
	void m1() {
		System.out.println("This is zero parameterised method");
		
	}
	public void m1(int i) {
		System.out.println("This is single paramerterised method");
		
	}
	 void m1(int i,char c) {
		 System.out.println("This is two parameterised method");
		 
		
	}

	public static void main(String[] args) {
		Moverloading a=new Moverloading();
		a.m1();
		a.m1(i);
		a.m1(i, c);
		System.out.println("Method Overloading Acheived in a Single Class");
		

	}

}
