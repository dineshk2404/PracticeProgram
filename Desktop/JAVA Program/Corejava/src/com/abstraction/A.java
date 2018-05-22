package com.abstraction;

public abstract class A {
	void m1() {
		System.out.println("I m in non abstract method");
	}

	abstract void m2();

}

interface Interface1 {
	// public static final int var=2;
	int var = 3;

	abstract void m4();
}
interface Interface2{
	void m5();
	
}
	class B extends A implements Interface1 ,Interface2{

		@Override
		void m2() {
			// TODO Auto-generated method stub
			System.out.println("I m in abstract method");
		}

		@Override
		public void m4() {
			// TODO Auto-generated method stub
			System.out.println("I m in interface1");
			//System.out.println(+var);
		}

		@Override
		public void m5() {
			// TODO Auto-generated method stub
			System.out.println("I m in Interface2");
			System.out.println(+var);
		}

		
	}

