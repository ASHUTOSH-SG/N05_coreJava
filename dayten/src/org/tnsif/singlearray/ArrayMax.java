package org.tnsif.singlearray;

import java.util.Arrays;
import java.util.Scanner;

// program to  run time array and to find out largest
// element in array
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the element to the array");
		int n =s.nextInt();
		
		// array declaration
		int arr[]=new int [n];
		
		// array initialization
		for(int i=0;i<n;i++)         //(int i=0;i<length-1;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("array elements are");
		
		for(int i=0;i<n;i++)         
		{
			System.out.println(arr[i]+" ");
		}
		
		int max=arr[0]; // set 0 index as maximum
		
		
		for(int i=0;i<n;i++) {
			if (arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest element is "+ max);
		//array is a class and
		// sort is the build in function
		
		Arrays.sort(arr));
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		
		
	}
	

}
