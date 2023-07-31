//this can be passed as argument in the constructor call
package org.tnsif.thiskeyword;

public class ThisKeywordDemoTwo {//default variable
	int x,y;
	
	// constructor
	
	public ThisKeywordDemoTwo(int x, int y) {
		
		this.x = x;
		this.y = y;
				
	}
	
	public void display() {
		System.out.println(x+" "+y);
	}
	
	
	public static void main(String[] args) {
		
		ThisKeywordDemoTwo t = new ThisKeywordDemoTwo(2,3);
		
		t.display ();
		

	}

}
