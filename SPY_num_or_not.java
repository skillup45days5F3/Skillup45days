package Logical_prgs1;

import java.util.Scanner;

public class SPY_num_or_not {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter any number:");
		int n=o.nextInt();
		int num=n;
		int sum=0,mul=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			mul=mul*rem;
			num=num/10;
			
		}
		if(sum==mul)
			System.out.println(n+" is SPY Number");
		else
			System.out.println(n+" is not a SPY Number");

	}

}
