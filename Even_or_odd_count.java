package Logical_Prgs;

import java.util.Scanner;

public class Even_or_odd_count {

	public static void main(String[] args) {
		Scanner o= new Scanner(System.in);
		System.out.println("Enter size of array:");
		int s=o.nextInt();
		int a[]=new int[s];
		int even=0,odd=0;
		System.out.println("enter "+s+" values:");
		for(int i=0;i<s;i++)
		{
			a[i]=o.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("even number count="+even);
		System.out.println("odd number count="+odd);

	}

}
