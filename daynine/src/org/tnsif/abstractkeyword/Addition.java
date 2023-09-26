package org.tnsif.abstractkeyword;

// to [provide implementation of any abstract method of parent class use child class
public class Addition extends Operator {
	
	void opertaion() {
		System.out.println("Addition");
	}

	@Override
	void multiplication() {
		// TODO Auto-generated method stub
		
		System.out.println("multiplication");
		
	}

}
