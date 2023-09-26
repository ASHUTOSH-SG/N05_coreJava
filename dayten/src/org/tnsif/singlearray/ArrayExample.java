package org.tnsif.singlearray;
// array using compile time input value
public class ArrayExample {

	public static void main(String[] args) {
		// declaration and initialization
		//of array at compile time
		
		int arr[]= {44,56,2,85,45};
		System.out.println("the array of swcond index is"+arr[2]);
		
		for (int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
