package Logical_Prgs;

import java.util.Scanner;

public class Fibonacci_within_range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt();  
		int t1 = 0, t2 = 1;
		System.out.println("Fibonacci range upto "+n + " :");
		System.out.print(t1+ " "+t2);
		for(int i= 2; i<=n; i++)
		{
			int sum = t1+t2;
			t1=t2;
			t2=sum;		
			
			if(sum>n)
			{	break; }
			
			System.out.print(" "+sum); 
		}
	}

}
