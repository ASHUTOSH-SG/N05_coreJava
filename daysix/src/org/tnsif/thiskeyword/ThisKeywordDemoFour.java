package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	// TODO Auto-generated method stub
	
	int x;
	ThisKeywordDemoFour()
	{
		// invoke the current parameterized constructor
		this(34);
		System.out.println("default constructor");
		
	}
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("parameterized constructor"+x);// call to default constructor
	}


	public static void main(String[] args) {
	
	}

}
