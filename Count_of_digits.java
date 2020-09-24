package Logical_Prgs;

import java.util.Scanner;

public class Count_of_digits {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=o.nextInt();
		int c=0;
		while (num!=0)
		{
			num=num/10;
			c++;
			
		}
		System.out.println("count of digits for given number is:"+c);


	}

}
