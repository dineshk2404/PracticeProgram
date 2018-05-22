package com.demo1;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class MyCollectionCursorImpl {

	
	public static void iterateUsingIterator(Collection<Emp> collection){
		System.out.println("\n\n");
		System.out.println("########Iterating Using iterator-- " +collection.getClass() +"##########");
		
		Iterator<Emp> itr = collection.iterator();
		
		/**
		 * hashnext
		 * next
		 * remove
		 */
		
		while(itr.hasNext()){
			Emp e = itr.next();
			System.out.print("Id -- "+e.getEmpId());
			System.out.print(" Name -- "+e.getEmpName());
			System.out.println(" Salary -- "+e.getEmpSalary());
			System.out.println("--------------------------------------");
		}
	}
	
	
	public static void iterateUsingListIterator(List<Emp> listOfEmps){
		System.out.println("\n\n");
		System.out.println("########Iterating using ListItrator -- " +listOfEmps.getClass() +"##########");
		
		ListIterator<Emp> itr = listOfEmps.listIterator();
		while(itr.hasNext()){
			Emp e = itr.next();
			System.out.print("Id -- "+e.getEmpId());
			System.out.print(" Name -- "+e.getEmpName());
			System.out.println(" Salary -- "+e.getEmpSalary());
			System.out.println("--------------------------------------");
		}
	}
	
	/**
	 * Legacy Classes
	 * 		Vector
	 * 		Stack
	 * 		Hashtable
	 * 		Properties
	 * 		Dictionary
	 * 
	 * @param ob
	 */
	
	public static void usingEnumaration(Object ob){
		Enumeration<String> emps =null;
		if(checkInstanceOfOb(ob)){
		/*	
			if(ob instanceof Vector){
				Vector v= (Vector)ob;
				Enumeration<Emp> empsss = v.elements();
				while(empsss.hasMoreElements()){
					Emp emp = empsss.nextElement();
				}
			}*/
			
			
			
			if(ob instanceof  Vector){
				Vector v = (Vector)ob;
				emps = v.elements();
			}else if(ob instanceof Stack){
				Stack v = (Stack)ob;
				emps = v.elements();
			}else if(ob instanceof Hashtable){
				Hashtable v = (Hashtable)ob;
				emps = v.elements();
			}else if(ob instanceof Properties){
				Properties v = (Properties)ob;
				Enumeration<Object> obEmps = v.elements();
			}else if(ob instanceof Dictionary){
				Dictionary v = (Dictionary)ob;
				emps = v.elements();
			}
			
			
			while(emps.hasMoreElements()){
				System.out.println(emps.nextElement());
				System.out.println("--------------------------------------");
			}
			
		
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
		}else{
			System.out.println("Cannot iterate using enumaration....!");
		}
	}


	private static boolean checkInstanceOfOb(Object ob) {
		if(ob instanceof  Vector || ob instanceof Stack || ob instanceof Hashtable || ob instanceof Properties || ob instanceof Dictionary){
			return true;
		}else 
			return false;
	}
	
	
}
