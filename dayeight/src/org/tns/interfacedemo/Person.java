package org.tns.interfacedemo;
// multiple inheritance using interface
public class Person implements ColdDrink,Alcohol {

	@Override
	public void showDrinkNme() {
		// TODO Auto-generated method stub
		System.out.println(brand +" "+alcoholname+" "+name);
		
	}

	@Override
	public void showDrinkName() {
		// TODO Auto-generated method stub
		
	}

}
