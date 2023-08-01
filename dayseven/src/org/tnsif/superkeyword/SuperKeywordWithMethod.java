package org.tnsif.superkeyword;

class sports
{
	String sportsName="Cricket";
	void display() {
		System.out.println("sports name is "+sportsName);
	}
}
class Cricket extends sports{
	
	int noOfPlayers=11;
	
	void display() {
		
		//if parrent  and child class method are same and if we
		//to call parent class method inside child use 
		//super.methodNmae
		
		super.display();
		System.out.println("no of player is "+noOfPlayers);
	}
	
	
	
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c= new Cricket ();
		c.display();
		

	}

}
