package Logical_Prgs;

import java.util.Scanner;

public class Palindrome_Range {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter size:");
		int s=o.nextInt();
		int a[]=new int[s];
		System.out.println("enter "+s+" numbers:");
		for(int i=0;i<s;i++)
		{
			a[i]=o.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			int rev=0;
			int temp=a[i];
		    while(a[i]>0)
		    {
			    int rem=a[i]%10;
			    rev=(rev*10)+rem;
			    a[i]=a[i]/10;
		    }
		    if(temp==rev)
		    	System.out.println(temp+" is Palindrome Number");
		    else
		    	System.out.println(temp+" is not Palindrome Number");
		    
		    	
		    
		}
		

	}

}
