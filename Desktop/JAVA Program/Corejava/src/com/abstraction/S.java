package com.abstraction;

public abstract class S {
void m1() {
	
}
abstract void m2();
}
class P extends S {
	void m3()
	{
		System.out.println("Subclass");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		P p=new P();
		p.m1();
		p.m2();
		p.m3();
	}
	
	
}
abstract class R extends S{
	abstract void m3();
	void m4() {
	}
	
	
	
}
/*interface extends R{
	
}*/
