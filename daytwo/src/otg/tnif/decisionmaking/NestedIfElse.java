// program to demonstrate cascding if else
package otg.tnif.decisionmaking;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		
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
