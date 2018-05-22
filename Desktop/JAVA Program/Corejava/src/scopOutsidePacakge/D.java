package scopOutsidePacakge;

import scopwithinPKG.A;

public class D extends A{
	void m1() {
		System.out.println(publicvar);
		System.out.println(protectedvar);
		//System.out.println(defaultvar);......Not possible outside package
		//System.out.println(privatvar);
	}
	//.....can call variables by creating object of same class........
/*void m2() {
	D d=new D();
	System.out.println(d.publicvar);
	System.out.println(d.protectedvar);
}


wrong way to call variables dont object of parent class
void m3()
{
	A a=new A();
	System.out.println(a.publicvar);
	//System.out.println(a.protectedvar);
}*/






}

