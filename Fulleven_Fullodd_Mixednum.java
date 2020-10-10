package Logical_prgs1;

import java.util.Scanner;

public class Fulleven_Fullodd_Mixednum 
{
	static void print(int num) 
	{
		int n= num; 
		int count=1;  
		while(num !=0 ) 
		{
			int rem = num%10 ;  
			if(n%2==0  && rem%2==1) 
			{
				count++;  
				break;
			}
			else if(n%2==1 && rem%2==0)
			{
				count++; 
				break;
			}
			
			num = num/10;
		}
		if(count==1 && n%2 == 0)
		System.out.println("Full Even Number");
		else if (count==1 && n%2==1)
		System.out.println("Full Odd Number");
		else
		System.out.println("Mixed Number") ;		
	}

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("enter number:");
		int num = obj.nextInt(); 
		print(num);
		

	}

}
