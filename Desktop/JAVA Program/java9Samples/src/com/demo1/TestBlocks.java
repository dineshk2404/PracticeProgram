package com.demo1;

public class TestBlocks {
	
	/**
	 * Load TestBlocks
	 * Main method execution 
	 * 
	 * 
	 * 
	 * 
	 * Load Parent class
	 * Parent Static fields will get memory
	 * Parent static block execution 
	 * Parent Instance Fields will get memory on Object inside heap
	 * Parent class instance block execution
	 * Parent class Constructor will get called
	 * 
	 * Parent Instance field Ini
	 * Parent Instance Block Exe
	 * Parent Constructor Exe
	 * Child Instance Fields Ini
	 * Child instance Block Execu
	 * Child Constructor exe
	 * 		(Note -- due to super() -- it will goto parent class's constructor)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Parent instance method
	 * Parent Static method
	 * 
	 * @param args
	 */
	
	
	public static void main(String[] args) {
			System.out.println("inside main method...!");
			Child c = new Child();
			
			/**
			 * Tblck class Loading  (Static field will get memory and static block exec)
			 * Main method execution 
			 * Load Parent Class
			 * Parent static fields ini
			 * Parent Static block execution
			 * Child Static fields ini
			 * Child Static block execution
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * TBlck loading
			 * Main method
			 * 
			 * Parent load
			 * 		-- Static fields ini
			 * 		-- static block execution
			 * 		
			 * 
			 * 		-- instance Fields inilization
			 * 		-- instance block execution
			 * 	    -- parent cha constructor
			 * 
			 * 
			 * 
			 */
			
			
			/**
			 * At the time of class loading  (Start with parent -- load parent first and then child)
			 * 		-- Static fields ini
			 * 		-- static block execution
			 * At the time of object creation
			 * 		-- Check the parent class-- and make sure the path is clear till 
			 * 			object class
			 * 
			 * (Start with parent then to the child class)
			 * 		-- Instance fields ini
			 * 		-- instance  block execution
			 * 		-- constuctor
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
	}

}

class Parent {

	int iParentId;
	static int sParentId;
	public Parent(int iParentId) {
		super();
		this.iParentId = iParentId;
		System.out.println("inside param constructor");
	}

	public Parent(){
		System.out.println("inside default constructor");
	}
	
	
	
	static{
		System.out.println("inside parent static block");
	}
	
	
	{
		System.out.println("inside parent instance block");
	}
	
	public void instanceMethod(){
		System.out.println("inside instance method");
	}
	
	static public void staticMethod(){
		System.out.println("inside static method..!");
	}
	
}


class Child extends Parent {

	
	int cParentId;
	static int scParentId;
	public Child(int iParentId) {
		super();
		this.cParentId = iParentId;
		System.out.println("Child --inside param constructor");
	}

	public Child(){
		super();
		System.out.println("Child -- inside default constructor");
	}
	
	
	
	static{
		System.out.println("inside Child -- static block");
	}
	
	
	{
		System.out.println("inside Child -- instance block");
	}
	
	public void instanceMethod(){
		System.out.println("Child --inside instance method");
	}
	
	static public void staticMethod(){
		System.out.println("Child --inside static method..!");
	}
	
	
	
	
	
}



