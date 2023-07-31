//program to demonstrate on do while
package tns.org.loppingstatement;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner s =new Scanner(System.in);
		int x=10;
		do {
			System.out.println("value of n is: "+n);
			n++;
		}while(n<14);
		
		
		

	
	
	// how many digit in the given number
	
	Scanner s=new Scanner(System.in);
	
	
	System.out.println("enter any number");
	int num =s.nextInt();
	int count =0;
	
	do {
		num = num/10;
		count++;
	}
	
	while(num!=0);
	
	System.out.println("number of digit: "+ count);
	
	
	}
	
	

	// right angle triangle using for loop

	int n= 4;
	
	for(int i=1; 1<=1;1++) {
		for(int j=1;j<=1;j++) {
			System.out.println("*");
			
		}
		System.out.println(" ");
	}
	
}



