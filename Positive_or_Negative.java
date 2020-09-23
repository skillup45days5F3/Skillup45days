package Logical_Prgs;

import java.util.Scanner;

public class Positive_or_Negative {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=o.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
			a[i]=o.nextInt();
		}
		System.out.println("output:");
        for(int j=0;j<n;j++)
        {
        	if(a[j]>0)
        		System.out.println(a[j]+" is positive");
        	else if(a[j]==0)
        		System.out.println(a[j]+" is neither positive nor negative");
        	else
        		System.out.println(a[j]+" is negative");
        }
	}

}
