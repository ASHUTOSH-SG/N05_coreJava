package org.tnif.multilavelinheritance;

public class TeamMember extends TeamLead {
	
	int size;
	int duration;
	
	
	public TeamMember(String deptName, String name, int emid, String leadName, int emID2, String projectName) {
		super(deptName, name, emid, leadName, emID2, projectName );
		
		// TODO Auto-generated constructor stub
		this.size=size;
		this.duration=duration;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	// to string


	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
