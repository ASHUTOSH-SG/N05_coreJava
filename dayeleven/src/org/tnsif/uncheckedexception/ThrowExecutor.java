package org.tnsif.uncheckedexception;

import java.io.IOException;

public class ThrowExecutor {
	
	// throws keyword is used to declare an exception
	void isEligible(int age,int weight) {
		if (age>18 && weight>50)
		{
			System.out.println("eligible to donate the blood");
		}
		else {
			// throw keyword is used to throw the exception explicitly
			//catch block throw implicitly
			throw new IOException("criteriya not fullfill")
		}
	}

	public static void main(String[] args)throw IOException {
		// TODO Auto-generated method stub
		isEligible(12,54);

	}

}
