package Logical_Prgs;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter number:");
		int n=o.nextInt();
		int t1=0,t2=1;
		System.out.println("Fibonacci numbers upto "+n);
		System.out.print(t1+" "+t2);
		for (int i=2;i<n;i++)
		{
			int sum=t1+t2;
			System.out.print(" "+sum);
			t1=t2;
			t2=sum;
		}

	}

}
