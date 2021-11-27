package com.deep.exception.handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

	
		Demo.method();
		
		
	}

}
class Demo
{
	

	static void method() throws FileNotFoundException
	{
	FileInputStream fid= new FileInputStream("E:/abc.txt");

		
		//System.out.println("succesfully ");
		
		
	}
}