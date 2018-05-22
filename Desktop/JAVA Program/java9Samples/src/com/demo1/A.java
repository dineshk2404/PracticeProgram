package com.demo1;
import java.lang.*;
public class A extends Parent {
	/**
	 * Instance area/block
	 * Static Area/block
	 * Instance Method
	 * Static method
	 * constructor -- D/P
	 */

/**
 * class loading
 * 			-- will get memory to your static fields --inside method area
 * static fields inilization
 * static block execution
 * main method execution
 *  					-- will get memory to your object inside heap area
 * instance fields inilization
 * instance block execution
 * constrcutor execution
 * 
 * 
 * 
 * 			-- will get memory to your object inside heap area
 * instance fields inilization
 * instance block execution
 * constrcutor execution
 * 
 * 
 */
	
	int instanceVar=0;
	static int staticVar=0;
	
	
	//Static block --
	static{
		System.out.println("inside A's Static area");
	}
	
	static public void staticMethod(){
		System.out.println("inside A's instance method");
	}
	
	{
		System.out.println("inside A's instance area");
	}
	
	public void instanceMethod(){
		System.out.println("inside A's instance method");
	}
	
	
	/**
	 * super 
	 * this
	 * debugging
	 * 
	 * 
	 */
	
	public A(){
		super(10);
		System.out.println("inside Default constrctor");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main method..!");
		A a1 = new A();
		A a2 = new A();
		staticMethod();
		a1.instanceMethod();
		
	}
}



/**Program execution flow if there are parent child class
 * PSFI
 * PSBE
 * CSFI
 * CSBE
 * MME
 * 
 * PIFI
 * PIBE
 * PCE
 * CIFI
 * CIBE
 * CCE
 * 
 * PIFI
 * PIBE
 * PCE
 * CIFI
 * CIBE
 * CCE
 * 
 * 
 * 
 * P= Parent
 * S=Static
 * F=Field
 * I=Initialization
 * C= Child
 * B=block
 * E=Execution 
 * MME= Main method Execution 
 * CCE=child constructor Execution 
 * PCE=Parent constructor Execution 
 *
 */



class Parent {
	 int xyz =0;
	 static int pqr = 0;
	
	static{
		System.out.println("inside parent Static block");
	}
	
	{
		System.out.println("inside parent instance block");
	}
	
	public Parent(int i){
		System.out.println("parent DC");
	}
	
}
