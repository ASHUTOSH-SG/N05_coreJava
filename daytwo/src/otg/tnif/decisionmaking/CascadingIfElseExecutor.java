// program to demonstrate cascding if else
package otg.tnif.decisionmaking;

import java.util.Scanner;

public class CascadingIfElseExecutor {
	public static void main(String[] args) {
	
//	Scanner s=new Scanner(System.in);
//	int age1 =s.nextInt();
//	int age2 =s.nextInt();
//	int age3 =s.nextInt();
//	
//	
//	if(age1>age2 && age1>age3) {
//		System.out.println("Age is Grater"+age1);
//	}
//	
//	if(age2>age1 && age2>age3) {
//		System.out.println("Age is Grater"+age2);
//	}
//	
//	else {
//		System.out.println("Age is Grater"+age3);
//	}
//	s.close();
		
		Scanner s=new Scanner(System.in);
		int age =s.nextInt();
		int weight =s.nextInt();
		
		if(age >=12) {
			
			if (weight>=40) {
				
				System.out.println("eligible for jump");
				if(weight>110) {
					
					System.out.println("extera ropes will add");
				}
			}
			else {
				
				System.out.println("you cant jump");
			}
			
			
			
			
			
			
		}
		else {
			
			System.out.println("you cant jump");
		}
		
		
		
	
	
	}
	
	
	
	
	


}
