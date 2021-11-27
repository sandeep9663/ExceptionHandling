package com.deep.exception.handle;

public class ExampleOfFinally
	{
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("inside the try");
			try
			{
				System.out.println(20/5);
			  System.out.println("inside the try1......");
			}
			catch(Exception a)
			{
				System.out.println("inside the catch");
			}
		}
		finally
		{
			System.out.println("inside the finally");
			try
			{
				System.out.println(30/10);
			  System.out.println("inside the finall1.");
			}
			catch(Exception e)
			{
				System.out.println("finally catch");
			}
		}
		}
		
	}
	
	