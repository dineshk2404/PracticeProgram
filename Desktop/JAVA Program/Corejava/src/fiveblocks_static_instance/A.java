package fiveblocks_static_instance;

public class A {
static {
	System.out.println("I m in static Block ");  //First Priority
}

{
System.out.println(" I m in instance Block ");	//Third Priority
}
static void m1() {
	
	System.out.println("I m in Static Method");   //Sixth Priority
	
}
void m2() {
	
	System.out.println("I m in Instance Method");    //Fifth Priority
	
}

A() {
	
	System.out.println("I m in Constructor");      //Fourth Priority
	
}
public static void main(String[] args) {                    //Second Priority
	System.out.println("I m in Main Method");
	
	A a =new A();
	a.m2();
	m1();
	
	}

}
