package Logical_prgs1;

import java.util.Scanner;

public class Sum_even_odd_digits 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter any number :");
		int num = obj.nextInt(); 
		int even_sum = 0, odd_sum =0;
		int temp=num;
		while(num != 0 ) 
		{
			int rem = num%10; 
			if(rem%2==0)
			 even_sum = even_sum + rem;
			else
			 odd_sum = odd_sum + rem; 
			num= num/10;  
		}
		System.out.println("Sum of even digits of "+temp+": "+ even_sum);
		System.out.println("Sum of odd digits of "+temp+": "+odd_sum);

	}

}
