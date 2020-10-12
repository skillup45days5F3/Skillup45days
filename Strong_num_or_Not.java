package Logical_prgs1;

import java.util.Scanner;

public class Strong_num_or_Not {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter number:");
		int n=o.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (sum==temp)
			System.out.println(temp+" is a Strong Number");
		else
			System.out.println(temp+" is not a Strong Number");
	}

}
