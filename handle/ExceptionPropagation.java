package com.deep.exception.handle;

public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		
	}
  
	public static void m1()
	{
		
		m2();
//		try
//		{
//			m2();
//		}
//		catch(Exception e)
//		{
//			System.out.println("exp handle m1");
//		}
	}
		
	
	public static void m2()
	{
		System.out.println(10/0);
	}
}
