package org.tns.finalkeyword;

// program to demonstrate  on final keyword with variable
public class FinalVariable {
	
	//the block final filed num may not have benn initialized 
	//final int NUM;
	
	final float SALARY =78000.67f;
	
	public void print(){
		
		// we cant change the value of final keyword
		//Salary = 8900.56f;
		System.out.println("salary is "+SALARY);
	}

}
