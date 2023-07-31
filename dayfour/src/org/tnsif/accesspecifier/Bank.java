//programe to demonstrate on access specifier
package org.tnsif.accesspecifier;

public class Bank {
	
	//diffrent acess specifier
	public String bankName;
	private int pinNo;
	long accountNo=3456778901234l;
	
	// public method
	public void displayPublic() {
		System.out.println("bank name is "+bankName);
	}
	// private method
	private void displayPrivate() {
		System.out.println("pin no is"+pinNo);
	}
	//default method
	void displayDefault() {
		System.out.println("account no is"+accountNo);
	}
	

}
