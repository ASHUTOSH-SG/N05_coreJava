// program to demonstrate on default and parameterized constructor
package org.tnsif.classobject;

public class Citizen {
	
	// data member
	String citizenType;
	long aadharNo;
	String gender;
	String city;
	
	//default constructor 
	//no return type
	
	
	
	Citizen()
	{
		System.out.println("Demonstrate on default constrouctor");
	}

	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
		
		
		
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
	

}
