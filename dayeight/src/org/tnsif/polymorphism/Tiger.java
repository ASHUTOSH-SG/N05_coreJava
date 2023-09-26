package org.tnsif.polymorphism;

public class Tiger {
	
	void eat()
	{
		System.out.println("eating child");
	}
	
	static void run () {
		
		// we can't override static method
		
		// super.run()
		System.out.println("runing child");
	}

}
