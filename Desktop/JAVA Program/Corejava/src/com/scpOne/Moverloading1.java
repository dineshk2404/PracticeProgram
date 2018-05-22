package com.scpOne;

public class Moverloading1 {
	int r=4;
	int l=2;
	int b=3;
	static int i=0;
	static int area1;
	static int area2;
	void m1()
	{
	double area1=3.14*r*r;	
	System.out.println("Area of Circle " +area1);
	}
	void m1(int i)
	{
		area2=l*b;
		System.out.println("Area of rectangle is " +area2);

	}

	public static void main(String[] args) {
		Moverloading1 m=new Moverloading1();
		m.m1();
		//int i = 0;
		m.m1(i);
	//	System.out.println("Area of Circle " +area1);
		//System.out.println("Area of rectangle is " +area2);

	}

}
