package com.scp.java.basic;


/**
 * 
 * File - new -- other -- project -- java project
 * --specify project name -- configure jre (make sure it's pointing to JDK)--
 * finish
 * 
 * 
 * Sample
 * 	  (.bin)  -- class files compiled once
 * 	  src  (You should write your source code)
 * 	  JRE Sytem Lib  (java's jars)
 * 
 * 
 * your eclipse compiles your java class file as and when you start typing but make
 * sure build automatically checkbox it ticked (Yes) (Project -- build automatically)
 * 
 * if that is untick -- you source files will not be compiled
 * 
 * after compilation eclipse keeps these files inside bin folder which is hidden (not shown in eclipse)
 * it has same pkg strcture as you have inside src with class files.
 * 
 * src -- source code 
 * .bin -- class file 
 * 
 * both has same pckg structure
 * 
 * 
 * 
 * 
 * 
 * package name should be more generic to the more specific
 * 
 * int i=10;  -- initialization
 * int i;  -- declaration
 * 
 * 
 * Student st;  //declare
 * Student st = new Student();  //initialization
 * 
 *
 */

// int i=10;

public class Student {
	int studentid; //4
	String studentName ;//;250
	int marks; //4
	String address; //250
	String collegeName; //250
	
	
	//AccessModifiers  Methodreturntype methodName  parameterlist{
	//}
	//void means nothing is going to be returned
	
	//Method signature = method name + parameter list
	
	
	/**
	 * 
	 * javaconceptoftheday
	 * dineshonjava
	 * concretepage
	 * studytonight
	 * 
	 */
	
public void showMarks(){
		System.out.println("inside showmarks method...");
		System.out.println(studentid);
		System.out.println(studentName);
		System.out.println(marks);
		System.out.println(address);
	}
	
	
	
	public int summation(int num1){
			if(num1==0)
				return 0;
		//	else
		
		return 10;
	}
	
	
	
	public Student(){
		
	}
	
	static public  void main(String x[]) {
		int i=10;
		
		//student :  Userdefineddatatype -- Clasname -- Template -- Structure -- blueprint
		//st1  :  ref to the object -- ref varible (not an object)
		//= : assignement
		// new -- allocates memeory to your object on heap
		//Student() -- special method called as constructor
		Student st1 = new Student(); // Object creation
		
		
	}
	
}




/**
 * constructor is a special method whoes name is similar as your class name
 * and doesnt have any return type too even void
 * 
 * 
 * 
 * 
 * 
 * method  
 * 			-- you can specify any name (as per identifier rules) + should hav return type atleast void
 * 			-- static and instance
 * 			-- user has to call this
 * constructor  
 * 		-- special method  -- name = class name -- no return type not even void
 * 		-- Default and Parameteried
 * 		-- gets called at the time Object creation 
 * 
 * 
 * 
 * 
 * memory model
 * types of variables
 * Types of methods
 * 
 * 
 * 
 * 
 * every prog executions starts with main method
 * 		main method singature = main(String type cha array)
 * 		return type should be void
 * 		allowed access modifiers -- public static(mandatory) ---- final(nonmandatory) 
 * 	
 * 
 * Your method access modifier sequence doesnt matter
 * 
 * 
 * if you dont specify access modifers for your method/variables -- "default"  is
 * the bydefault access modifier
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


/**
 * 
 * 
 * 
 * Java lang fundamentals
 * 	-- Identifires
 * 			-- Which identifies 
 * 						-- Class
 * 						-- Method
 * 						-- Variable
 * 
 * 
 * Class -- userdefined datatype --- Collection of methods and variables
 * Variable -- Its a name given to your memory location -- why  ?
 * 			As a human begin you cannot remeber addresses
 * Method -- Collection of lines of code -- which can be reused -- bevaviour of your objects
 * 
 * identifier rules  (Class -- Methods -- Variables)
 * 		-- allowed  (A-Z, a-z , 0-9, $ , _ )
 *      -- should not start with digit
 *      -- case sensitive
 *  Recommandation
 *  	-- should have Meaningful name
 * 		-- length should be limited to 15 not more thn that
 */
