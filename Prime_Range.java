package Logical_Prgs;

import java.util.Scanner;

public class Prime_Range {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("enter 2 numbers :");
		int n1 = o.nextInt();
		int n2 = o.nextInt();
		System.out.println("prime numbers between "+n1 +" and "+ n2+" are :");
		for(int i=n1+1; i < n2; i++ )  
		{
			int c=0;
			
			for(int n = i; n>=1; n--) 
			{
				 if(i%n==0) 				 
				 { 
					 c= c+1;
				 } 
			}
			if (c==2)
				System.out.print(i+" "); 
		}

	}

}
