package Logical_Prgs;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range :");
		int r = sc.nextInt(); 
		System.out.println("Prime numbers in between 1 to "+r+" :");
		for(int i=1; i<=r ; i++) 
		{
			int c=0; 
			for(int n = i; n>=1; n--)
			{
				if(i%n==0) 
				{
					c= c+1;
					}
			}	
			if(c==2)
				System.out.print(i+" "); 
		}

	}

}
