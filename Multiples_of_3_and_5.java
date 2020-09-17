package Logical_Prgs;

import java.util.Scanner;

public class Multiples_of_3_and_5 
{

	public static void main(String[] args) 
	{
	Scanner obj = new Scanner(System.in);
    System.out.println("enter 2 numbers:");
	int s = obj.nextInt(); // s=15
	int n = obj.nextInt(); // n= 120
	System.out.println("Multiples of 3 and 5 are:");
	for(int i=s; i<=n;i++)
	{
		if(i%3==0 && i%5==0)
		System.out.print(i+" ");
	}
	}

}
