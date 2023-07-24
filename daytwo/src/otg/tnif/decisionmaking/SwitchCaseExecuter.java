package otg.tnif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno) 
		{
		case 1:
			System.out.println("Perfect");
			break;
			
		case 2:
			System.out.println("OOAntava");
			break;
				
		case 3:
			System.out.println("taki taki");
			break;
				
		default:
			System.out.println("Invalid");
			
		
		
		
		}
		
	
		
		
		

	}

}
