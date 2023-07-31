//driver class 
// 
package org.tnsif.singleinheritance;

public class SingleInheritanceExecutor {

	public static void main(String[] args) {
		
		Student s1=new Student();   // child class default coonstructor 
		
		Student s= new Student("pune",431001,456213845123L,784595157L,"IIT",123);
		//output is parameter constructor from citizen
		
		System.out.println(s);

	}

}
