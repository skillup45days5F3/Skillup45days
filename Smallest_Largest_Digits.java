package Logical_prgs1;

import java.util.Scanner;

public class Smallest_Largest_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number :");
		int num = sc.nextInt(); 
		int small,large;
		small = large = num%10; 
		while(num > 0 )
		{
			int rem = num%10; 
			
			if(rem > large) 
			{
				large = rem;
			}
			else if(rem <= small)
			{ 
				small = rem; 
			} 		
			num = num/10;  					
		}
			System.out.println("The Smallest digit of given number:"+small);
			System.out.println("The Largest digit of given number: "+ large);
	}

}
