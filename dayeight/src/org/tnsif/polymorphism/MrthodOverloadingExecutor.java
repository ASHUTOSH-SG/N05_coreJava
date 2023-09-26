package org.tnsif.polymorphism;
// program to demonstrate on compile time polymorphism

import java.util.Scanner;

class Bollywood{
	
	String str1,str2,str3;
	//method overloding based on changing the the no of argument
	
	//method
	 static void  display(String str1,String str2) {
		
		System.out.println(str1+"loves"+str2);
	}
	
	//method
		static void display(String str1,String str2,String str3) {
			
			System.out.println(str1+"loves"+str2+"as wel as "+str3);
		}
	
}


public class MrthodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		
		Bollywood.display(str1,str2);
		Bollywood.display(str1,str2,str3);
		

	}

}
