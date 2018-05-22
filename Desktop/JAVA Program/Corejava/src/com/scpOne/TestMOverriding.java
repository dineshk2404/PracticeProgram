package com.scpOne;

public class TestMOverriding {
	static int i=0;
	int j;
	

	public static void main(String[] args) {
		 
	
		Moverriding o=new Moverriding();   //A a =new A Relation
		o.m1(10,20);
		B b=new B();                       //B b=new B() Relation
		b.m1(10,20);
		Moverriding or=new B();            //A a=new B Relation And This is the actual concept of Overriding
		or.m1(10,20);
		
		//System.out.println(or.x);
		
		
		//B b=new B();
		//System.out.println(or.x);
	//	b.m1(10,20);
		System.out.println("Method Overriding Achieved in Single file");
	}

	}


