package org.tnsif.singlearray;

// Employee
public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		arr[0] =new Employee(101,"kunal",90000.9);
		arr[1]=new Employee(102,"sahil",80000.9);
		
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getid()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
			
			
			
			
			
			
			
			

	}

}
