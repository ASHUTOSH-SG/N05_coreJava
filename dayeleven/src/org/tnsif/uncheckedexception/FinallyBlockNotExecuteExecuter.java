package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class FinallyBlockNotExecuteExecuter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		int x=s.nextInt();//12
		int y=s.nextInt();//4
		
		
		try {
			System.out.println(x/y);
			//System.exit(0);
			// when we use system. exit 
			// the finally block does not exist
			
			//if there any exception occur  in x/y   10/0
			//then catch block will execute
			
			// also finally block will execute 
		}
		// catch block is used to handle the exception
		
		
		// catch(Arithmatic
		catch(Exception e)
		{
			System.out.println("exception handle"+e);
		}
		finally{
			
			// when finally block contain an exception
			// then finally block does not execute
			System.out.println(4/0);
			System.out.println("finaly always execute");
		}
		

	}

}
