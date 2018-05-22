package com.Two;

public class switchcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
final int y=20;
switch(x)
{
case 10:
	System.out.println("10");
	
case y:
	System.out.println("20");
}
	}

}
/*NOTE:
	IF WE DECLARE Y AS A FINAL WE WON'T GET ANY COMPILE TIME ERROR
	BUT SWITCH ARGUMENT AND CASE LABLE CAN BE EXPRESSIONS,BUT CASE LABLE SHOULD BE CONSTANT EXPRESSION*/