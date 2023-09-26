package org.tnsif.statickeyword;
//static keyword if any variable is non static
// and outside the main function
// and if want to use  it in the main function
//then we have to make that variable static
public class StaticVariableexecutor {
	
	// int num1 = 67;   // non-static variable
		static int num = 67;
		
		public static void main(String[] args) {
			
			 // accessing non-static variable with object
//			StaticKeywrodWithVariable s = new StaticKeywrodWithVariable();
//			System.out.println(s.num1);
			
			// accessing static variable directly
			System.out.println(num);

		}


}
