//hetrogeneous list
package org.tnsif.collectionframwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Executor {
	public static void main(String args[])
	{
		
		@SuppressWarnings("rawtypes")
		List listOne=new ArrayList();
		listOne.add(10);
		listOne.add(true);
		listOne.add(34.78f);
		listOne.add("hellow");
		listOne.add(new String("hi"));
		
		System.out.println(listOne);
		
		//cllassification
		Collections.sort(listOne);
	}

}

