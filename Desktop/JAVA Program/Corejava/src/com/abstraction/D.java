package com.abstraction;

import java.nio.charset.MalformedInputException;

class Z{
	void m1() {
		System.out.println("I m in Parent class");
	}

}

class child extends Z {
	void m2() {
		System.out.println("I m in child class");

	}
}

abstract class abs extends Z {
	void m3() {
		System.out.println("I m in Abstract class with method 3");

	}

	abstract void m4();
}

 public class D extends abs {

	@Override
	void m4() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method m4");

	}

	public static void main(String[] args) {
		D d = new D();
		d.m1();
	d.m3();
		d.m4();
	}

}
/*
 * interface extends B{.........Interface not able to extend Class
 * 
 * }
 */
