package com.deep.exception.handle;

class Voating extends RuntimeException
{
	Voating()
	{
		super("you not elligible tha vota");
	}
		Voating(String msg)
		{
			super(msg);
		}
}

public class YoungerAgeException {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub

		int Age =17;
	try {	
		if(Age<18)
		{
			throw new Voating();
		}
		else
		{
			System.out.println("you succesfull voated");
			
		}
		
	}
	catch(Voating e)
	{
		
		e.printStackTrace();
		System.out.println("Exception handle");
		
	}
	}

}
