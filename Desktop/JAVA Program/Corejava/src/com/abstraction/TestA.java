package com.abstraction;

import java.nio.charset.MalformedInputException;

public abstract class TestA {
	void m1() {
		System.out.println("Non Abstract Method One");
	}

	abstract void m2();

}

interface Interface3 {
	int i = 4;// ....by variables are public static final we have to initialize value of it
				// due to final

	void m3();

}

interface interface4 {
	void m4();

}

class Test extends TestA implements Interface3, interface4 {

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("Interface Two Method Four");

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("Interface one Method Three");

	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method Two");
	

	}
	public static void main(String[] args) {
		Test t=new Test();//....Create object of child class n call all methods 
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		 
		TestA a=new Test();// If we create Object of parent(Abstract)class only material of Parent class is called.
		a.m1();
		a.m2();
		
	}

}
