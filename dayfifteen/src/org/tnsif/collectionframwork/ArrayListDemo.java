//Generic homogeneous ArrayList
package org.tnsif.collectionframwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>intList=new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(15);
		intList.add(17);
		intList.add(19);
		intList.add(9);
		intList.add(1);
		
		System.out.println(intList);
		System.out.println("======affter ADDING");
		intList.add(2,50);
		System.out.println(intList);
		
		Collections.sort(intList);
		System.out.println("=======affter sorting===========");
		System.out.println(intList);
		
		Collections.reverse(intList);
		System.out.println("=======affter reversing===========");
		System.out.println(intList);
		
	
		
		
		

	}

}
