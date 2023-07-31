package org.tnsif.singleinheritance;
// derive class
public class Student extends Citizen {
	
	private int rollno;
	private String collegeName;
	
	// default
	public Student() {
		//super() -it calls to parent class default constructor
		super();
		System.out.println("child class default constructor");
	}
	public Student(String city, int pincode, long aadharNo, long contactNO, String CollageName, int rollno) {
		super(city, pincode, aadharNo, contactNO);
		this.rollno =rollno;
		this.collegeName=collegeName;
		// TODO Auto-generated constructor stub
		
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	
	
	
	
	
	
	

}
