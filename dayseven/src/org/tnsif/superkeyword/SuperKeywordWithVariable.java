package org.tnsif.superkeyword;

class State{
	String statename="punjab";
	
	
}

class Capital extends State{
	
	String staename="Hariyana";
	String caapital ="chadigarh"; // same variable as parent
	
	public void dispaly()
	{
		// super keyword with variable is used to call
		//parent class variable if and only if parent and child class variable name 
		//are same
		System.out.println(super.statename); //punjab
		System.out.println(statename);       // hariyana
	}
	
}


//driver class
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		
		//create obj of child
		
		Capital c =new Capital();
		System.out.println(c.statename);
		c.dispaly();
		

	}

}
