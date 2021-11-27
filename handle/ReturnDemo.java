package com.deep.exception.handle;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(m1());
		
		
	}

	public static int m1()
	{
		
		try
		{
			int r=10/0;
			return 10;
		}
		catch(Exception e)
		{
			return 20;
		}
		finally
		{
			return 40;
		}
	}
	
	
}
