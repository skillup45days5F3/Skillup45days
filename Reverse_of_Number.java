package Logical_Prgs;

import java.util.Scanner;

public class Reverse_of_Number {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=o.nextInt();
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of given number is:"+sum);
	}

}
