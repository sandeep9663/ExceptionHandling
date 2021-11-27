package com.deep.exception.handle;

import java.util.Scanner;

 class VoatingException extends RuntimeException
{

	 VoatingException(String msg)
	{
		//super(msg);
	}


}

public class Voating1
	 {
public static void main(String [] args)
			{
							Scanner sc = new Scanner(System.in);
							System.out.println("Enter the Age");
							int age=sc.nextInt();
							try
						{
							if(age < 18)
							{
								throw new VoatingException("You not illegible for vote");
							}
							else
							{
							System.out.println("you can volt succesfully");
							}
						}
							catch(Throwable e)
							{
								e.printStackTrace();
							}
							
						System.out.println("hello");
							}
							
			
	    
			}
