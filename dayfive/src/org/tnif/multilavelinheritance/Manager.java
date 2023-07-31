package org.tnif.multilavelinheritance;

public class Manager {
	
	private String deptName;
	private String name;
	private int emid;
	
	
	
	// default constructor
	public Manager() {
		super();
		System.out.println("this is default of manager");
		
	}


	//para constructor
	
	public Manager(String deptName, String name, int emid) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.emid = emid;
	}
	
	
	
	// to string


	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", emid=" + emid + "]";
	}
	
	
	// getter and setter


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEmid() {
		return emid;
	}


	public void setEmid(int emid) {
		this.emid = emid;
	}
	
	

	
	
	
	
	
	
	
	
	

}
