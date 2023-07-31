package org.tnif.accessspecifierdemo;
import org.tnsif.accesspecifier.Bank;
public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank(); //
		b.bankName="SBI";
		
		b.displayPublic();
		// b.pinNO;
		//b.displayPrivate
		
		
		                          // both the above method are private 
		                          //so we can't access into another class and another package 
		                         //only we can access private
		                         //data member inside same class
		
		
		//default  member
		//b.account number
		//b.displayDefault();   //both the method are default thats why we are
		                        // we are not able to access them into another
		                        //only we can access in same  package
		
		
		
		

	}

}
