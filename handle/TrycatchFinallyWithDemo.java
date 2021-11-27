package com.deep.exception.handle;

public class TrycatchFinallyWithDemo {

	

	    public static void main(String[] args) {

	        System.out.println(method());
	    }

	    public static int method()
	    {
	        try
	        {
	            int r = 10/0;
	           
	            return 10;
	           
	        }
	        catch (Exception e)
	        {
	            return 20;
	        }
	        finally {
	        	
	            return 30;
	           
	        }
	    }
	
}

