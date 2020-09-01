package pack3_Arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter "+n+" array value:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("values \t index");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]+" \t "+i);
		}
		
	     
	}

}
