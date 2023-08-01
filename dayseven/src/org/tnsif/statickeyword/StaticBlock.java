package org.tnsif.statickeyword;

public class StaticBlock {
	
	static float salary;
	String companyName;
	
	
	//static block used to initialized static variable
	// we can't assign a value 
	//for any non static variable inside the static block
	static {
		//companyName ="Amzon";
		salary=5748.90f;
		
	}
	
	static void print() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
