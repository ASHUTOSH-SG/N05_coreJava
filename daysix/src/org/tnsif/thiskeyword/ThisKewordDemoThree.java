package org.tnsif.thiskeyword;

public class ThisKewordDemoThree {
	
	
	void print(ThisKewordDemoThree t)
	{
		System.out.println("i am using 'this'" + "keword");
	}
	
	void display()
	{
		// when you call any parameterized method inside non parameterized method
		//the we get an error to overcome that we have to use this keyword as argument 
		// in method class
		print(this);
	}

	public static void main(String[] args) {
		ThisKewordDemoThree t = new ThisKewordDemoThree();
		t.display();
		
		
	

	}

}
