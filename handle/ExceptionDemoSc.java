package com.deep.exception.handle;

import java.util.Scanner;

public class ExceptionDemoSc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the first value");
		Scanner sc = new Scanner(System.in);
		
		int input =sc.nextInt();
		System.out.println("enter the second value");
		
		int input1 =sc.nextInt();
	int res=0;
	res= input/input1;
	
	try{
		res=input/input1;
		}
	catch (ArithmeticException e)
	{
		//System.out.println("ArithmeticException");
	}
	
	System.out.println(res);
	
	}

}
