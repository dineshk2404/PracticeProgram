package com.scp.demo;

public class Student {

	int studId;// 4
	String studName; // 250
	int marks;// 4

	static String collegeName;// 250

	public void showStudentInfo() {

	}

	public void printStudentInfo() {

	}

	
	

	//Which is from object class which is parent of every java class
	//and this method is used to represent the object state
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName
				+ ", marks=" + marks + " ,CollegeName" + collegeName + "]";
	}

	public static void main(String[] args) {
		collegeName = "PICT";

		Student st1 = new Student(); // User defined dt
		st1.studId = 10;
		st1.studName = "Abc";
		st1.marks = 89;
		Student st2 = new Student(); // User defined dt
		st2.studId = 20;
		st2.studName = "PQR";
		st2.marks = 90;

		System.out.println("Before clg gets changed");
		System.out.println(st1);
		System.out.println(st2);

		st1.marks = 92;
		collegeName = "COEP";

		System.out.println("After clg gets changed");
		System.out.println(st1);
		System.out.println(st2);

	}

	int i = 10;

}
