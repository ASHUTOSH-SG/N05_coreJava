package tns.org.loppingstatement;

import java.util.Scanner;

public class WhileLoopExecuter {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(n>=i)
		{
			System.out.print(n+" ");
			n--;
		}
	}

}
