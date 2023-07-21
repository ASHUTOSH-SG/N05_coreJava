package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num=s.nextInt();
		System.out.println("The value of num is " + num);
		
		System.out.println("Enter the value of float");
		Float num1=s.nextFloat();
		System.out.println("The value of float is " + num1);
		
		System.out.println("enter the value of char");
		char c=s.next().charAt(0);
		System.out.println("character is :" +c);
		
		System.out.println("enter the value of string");
		String str1=s.nextLine();
		System.out.println("string is :"+str1);
		
		
		

		

	}

}
