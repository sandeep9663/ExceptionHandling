package com.deep.exception.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
	int a=sc.nextInt();
	int b=sc.nextInt();
	int res=0;
	try
	{
		
		System.out.println("try");
		System.out.println(a/b);
			System.out.println("hi...");
		System.out.println("hello");
		System.exit(0);


	}
	catch(ArithmeticException | NullPointerException | ClassCastException | AssertionError e)
	{
		System.out.println("cat");
		System.out.println(e.toString());
		
		//e.printStackTrace();
	}
	finally
	{
		System.out.println("inside the finally block");
	}

	}
}





 