package org.tnsif.polymorphism;

public class StaticMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger t=new Tiger();
		t.eat();
		// we cant override static method
		t.run();

	}

}
