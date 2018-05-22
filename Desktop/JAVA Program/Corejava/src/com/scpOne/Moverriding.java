package com.scpOne;

public class Moverriding {
	//int x=9999;
	//int i=3,j=4;
	
void m1(int i,int j) {
	int z=20; //I want to change value of instance variable
	int i1=3,j1=4;
	int q=i1+j1;
	
	
	System.out.println("I m in Parent Class" +q);
	System.out.println("value of z is "+z);
	
}

}
class B extends Moverriding{
	//int x=0000;
	 protected void m1(int i,int j) {
		 int z=30;   //Changed vaiue of instance variable
		 int a=4,b=6;
		 int r = a+b;
		 
		 System.out.println("I m in Child Class"    +r); 
		 System.out.println("Value of z is " +z);
		
	}
}
