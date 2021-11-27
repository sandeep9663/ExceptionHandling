package com.deep.exception.handle;

class VoatingException extends Exception 
{
	VoatingException()
	{
		super("you not elligible tha vota");
	}
		VoatingException(String msg)
		{
			super(msg);
		}
}




public class CustmizeException {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		try {
		System.out.println();
		
			throw new VoatingException();
		
		//System.out.println("you succesfull voated");
			
			
  }	
	
	catch(VoatingException e)
	{
		//e.printStackTrace();
		System.out.println("Exception handle");
		
	}
	}

}

