// it can be used to refer instance variable of current class
package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	
	
	//default variable
	int x,y;
	
	void setData (int x,int y)
	{
		//we can change the parameter x=e and y=q
		this.x=x;
		this.y=y;
	}
	void display (int x,int y)
	{
		
		System.out.println(x+" "+y);
		
	}

	public static void main(String[] args) {
		
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(2, 3);
		t.display ();
		

	}

}
