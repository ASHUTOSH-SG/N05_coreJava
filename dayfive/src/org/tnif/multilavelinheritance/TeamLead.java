package org.tnif.multilavelinheritance;

// child class2
// parent class 2

public class TeamLead extends Manager {
	
	private String leadName;
	private int emID;
	private String projectName;
	
	
	//getter and setter
	
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmID() {
		return emID;
	}
	public void setEmID(int emID) {
		this.emID = emID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	//to string
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", emID=" + emID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	// para
	public TeamLead(String deptName, String name, int emid, String leadName, int emID,String projectName) {
		super(deptName, name, emid);
		this.leadName= leadName;
		this.emID=emID;
		this. projectName = projectName;
		
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	
	
	
	
	

}
