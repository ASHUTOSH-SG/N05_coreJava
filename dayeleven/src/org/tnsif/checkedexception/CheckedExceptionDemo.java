package org.tnsif.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\ashut\\Desktop");
			System.out.println("file has found");
			
		}
		catch(FileNotFoundException e){
			System.out.println("file is not exist"+e);
			
		}

	}

}
