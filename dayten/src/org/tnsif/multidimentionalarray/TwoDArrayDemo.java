package org.tnsif.multidimentionalarray;

import java.util.Scanner;

// program on 2d array
public class TwoDArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr [][]  =new int[3][2];
		
		// initializing array value
		//
		for(int i=0;i<3;i++)
		{
			for (int j=0; j<2; j++)
			{
				arr[i][j]=s.nextInt();
			}
			System.out.println(arr[i][j]);
		}
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
