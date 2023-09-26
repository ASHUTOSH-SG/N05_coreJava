package org.tnsif.uncheckedexception;

public class ArrayIndexOutofBoundExceptionExecutor {
	
	static void print(int arr[]) {
	try {
		System.out.println(arr[4]);
	}
	catch(Exception e)
	{
	    System.out.println("exception handle"+e);	
	}
	finally
	{
		System.out.println("finaly block always execute");
	}
	
	//
	System.out.println("any statement outside the block is always executed");
	
}

	public static void main(String[] args) {
		int arr[]= {12,4,5};
		print(arr);

	}

}
