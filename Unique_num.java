package Logical_prgs1;

import java.util.Scanner;

public class Unique_num {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num =obj.nextInt();
		int c,flag=1;
		int no=num;
		for (int i=0;i<=9;i++)
		{
			num=no;
			c=0;
			while(num>0)
			{
				int digit=num%10;
				if (digit==i)
					c++;
				num=num/10;
			}
			if(c>1)
			{
				flag++;
				break;
			}
		}			
		if(flag==1)
			System.out.println(no+" is Unique Number");
		else
			System.out.println(no+" is not Unique Number");

	}

}
