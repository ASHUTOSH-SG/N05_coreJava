package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contain exception code
		try {
			System.out.println(x/y);
		}
		// catch block is used to handle the exception
		catch(Exception e)
		{
			System.out.println("exception handle"+e);
		}
		
		
		
		
		

	}

}
