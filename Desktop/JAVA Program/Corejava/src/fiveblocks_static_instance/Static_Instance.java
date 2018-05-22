package fiveblocks_static_instance;

public class Static_Instance {
	int instancevar=0;
	static int staticvar=0;
	static {
		System.out.println("static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	 /*Static_Instance()
	 {
		System.out.println(" Zero Paramerterized Constructor"); 
	 }*/
   Static_Instance(int i)
	 {
		 System.out.println("Parameteried Constructor"); //Only One Constructor is called at a time
	 }
	 static void m1()
	 {
		 System.out.println("Static Method");
		 
	 }

	void  m2()
	 {
		System.out.println("Instance Method"); 
	 }
	public static void main(String[] args) {
		System.out.println("Main Method");
		Static_Instance st=new Static_Instance(0);
		st.m2();
		m1();
		
		
		

	}

}
