package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecuter {

	public static void main(String[] args) throws LoginCeidentials {
		System.out.println("entere email and pass");
		Scanner s=new Scanner(System.in);
		String email=s.nextLine();
		String password=s.nextLine();
		
		if (email.equals("ashutoshsgangurde@gmail.com")&&password.equals("pass@123")) {
			
			System.out.println("wellcome");
		}
		else {
			throw new LoginCeidentials ("invalid pass");
			
		}
//		catch (LoginCeidentials e) {
//			System.out.println(e);
//		}

	}

}
