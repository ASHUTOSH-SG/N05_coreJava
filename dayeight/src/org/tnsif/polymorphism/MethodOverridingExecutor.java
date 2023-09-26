package org.tnsif.polymorphism;

import java.util.Scanner;

//MethodOverriding

class Laptop{
	
	// two or more method having same name and para
	// data type shuld be same 
	// method name same 
	//
	
	String generation1,generation2;
	static void specification(String generation1) {
		System.out.println("laptop"+generation1);
	}
	
}

class Asus extends Laptop{
	
	String generation1,generation2;
	static void specification(String generation2) {
		Laptop.specification(generation2);
		System.out.println("Asus"+generation2);
	}
	
}

public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Asus a= new Asus();
		Scanner sc = new Scanner(System.in);
		String generation1=sc.nextLine();
		String generation2=sc.nextLine();
		Asus.specification(generation1);
		
		
		

	}

}
