// it can be used to refer instance variable of current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	// Default variable
	int x,y;
	
	// Set data method
	// We can change the variable name to avoid confusion instead of this keyword
	void setData(int x, int y) {
		x=x;                            
		// without this
		 // Here, the parameter 'x' shadows the instance variable 'x'.
        // The assignment 'x = x' is actually assigning the value of the parameter 'x' to itself.
        // This means that the instance variable 'x' remains unchanged, and it will still have the default value of 0.
		
		                              
		this.y=y; 
		// this keyword is used to avoid the confusion between                     
		// default variable and method's parameter.
		// Similar to above, 'this.y' refers to the instance variable 'y' of the current class,
        // and 'y' on the right side refers to the method's parameter 'y'.
        // The assignment 'this.y = y' sets the value of the instance variable 'y' to the value of the method's parameter 'y'.'
	}
	// Method
	void display() {
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(2, 3);
		t.display();
	}

}


