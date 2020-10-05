package Logical_Prgs;

import java.util.Scanner;

public class Fibonacci_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n = sc.nextInt(); 
		int a = 0, b= 1, c=0;
		while(c<n) 
		{
		  c = a+b;	
		  a=b; 
		  b=c; 
		}
        if(c==n) 
    	    System.out.println(n + " is Fibonacci Number");
        else
    	    System.out.println(n + " is Not Fibonacci Number");

	}

}
