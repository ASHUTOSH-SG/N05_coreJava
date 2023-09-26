package org.tns.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
//		//we can not instantiate interface
//		
//		SBIDebitCard s=new SBIDebitCard();
//		
//		s.displayCardDetails();
//		// we can call default method of interface using object
//		// of the implementable class
//		
//		// print()
//		// print is a static method inside the interface 
//		// to call print() method we have to use interfacename.method
//		// name();
//		
//		DebitCard.print();
//		
//		
		
		CheesePopCorn c =new CheesePopCorn();
		c.dispalyRecipe();
		
		Person p= new Person();
		p.showDrinkName();
		

	}

}
