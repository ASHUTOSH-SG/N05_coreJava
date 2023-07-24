//program to demonstrate on relational operator
package org.tnsif.operator;

import java.util.Scanner;

public class RelatiOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(5==7);
//		System.out.println(5==5);
		

// check the age and wegiht for blood donation		
		
// by condition operator		
		
		Scanner s=new Scanner (System.in);
		int age=s.nextInt();
		float wegiht=s.nextFloat();
		
		if((age>18)&&(wegiht>50)) {
			System.out.println("your eligible");
		}
		
		else {System.out.println("you are not eligible");}
		
// by Ternary operator				
		
//		String ageeligible=( age>18)?"Eligible":"Not Eligible";
//		System.out.println("Result is:"+ageeligible);

	}

}
