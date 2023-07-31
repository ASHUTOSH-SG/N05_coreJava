//program to demonstrate encapsulation
//encapsulation acheives data hiding using private access spacifier
package org.tnif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC h=new HDFC(); //create object
		//calling setter and seting the values
		h.setAccountNo(23313156498461l);
		//h.accountType("current account");
		h.setCvvNo(223);
		h.setPinNo(1221);
		//accessing and printing all the private members
		
		System.out.println(h.getAccountNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());

	}
	
	
	

}
