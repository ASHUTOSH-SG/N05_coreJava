package org.tnsif.singleinheritance;
// base class
public class Citizen {
	private String city;
	private int pincode;
	private long aadharNo;
	private long contactNO;
	
	
	
	
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}




	// PARA CONST
	public Citizen(String city, int pincode, long aadharNo, long contactNO) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.contactNO = contactNO;
	}
	
	
	
	
	//GENERATE GETER AND SETER
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNO() {
		return contactNO;
	}
	public void setContactNO(long contactNO) {
		this.contactNO = contactNO;
	}
	
	
	
	// TO STRING
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactNO=" + contactNO
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getAadharNo()=" + getAadharNo()
				+ ", getContactNO()=" + getContactNO() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	
	

}
