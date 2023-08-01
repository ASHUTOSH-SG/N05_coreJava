package org.tnsif.statickeyword;

public class StaticMethod {
	
	 int x=2; // non static variable
	static String collagename="MET";
	
	//if any method outside main and you want to access it in main
	//you have to make it static
	//static method
	public static void print () {
		
		System.out.println(collagename );
		
		// we can't  use non static variable inside static method
		//System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
