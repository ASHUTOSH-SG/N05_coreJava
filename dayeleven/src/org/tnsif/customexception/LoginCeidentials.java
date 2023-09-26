package org.tnsif.customexception;

import java.util.Arrays;

//program for user define exception 
public class LoginCeidentials extends Exception {
	//private data member
	private String str;
	
	
	//para constructor

	public LoginCeidentials(String str) {
		super();
		this.str = str;
	}
	
	// to string
	@Override
	public String toString() {
		return "LoginCeidentials [str=" + str + "]";
	}


	
	
	
	// getter setter

	public String getStr() {
		return str;
	}

	

	public void setStr(String str) {
		this.str = str;
	}
	
	
	
	
	
	
	
	
	
	

}
