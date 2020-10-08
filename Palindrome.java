package Logical_Prgs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter a number more than 1 digit:");
		int n=o.nextInt();
		int num=n;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(n==rev)
			System.out.println(n+" is a Palindrome Number");
		else
			System.out.println(n+" is not a Palindrome Number");
	}

}
