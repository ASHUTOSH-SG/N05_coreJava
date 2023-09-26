package org.tns.interfacedemo;

public interface DebitCard {
	//long cardno;
	//The blank final field cardno may not have been initialized
	
	// by default all variable inside interface
	//are public static final
	//in final we have to initialized value for that variable
	
	long cardno=575445155454L;
	
	// we can't use concrete method inside interface
	//Abstract methods do not specify a body
	// in interface all method by default are abstract
	void displayCardDetails();
	
	// default method and static method is the new features of  java 8
	//inside an interface
	
	// so we can use body there(implementation)
	default void display() {
		
	
	}
	
	// Static method also
	
	static void print() {
		System.out.println("static method");
	}
	

}
