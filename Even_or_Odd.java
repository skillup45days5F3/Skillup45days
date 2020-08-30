package pack2_looping_statements;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number:");
		int x=obj.nextInt();
		if(x%2==0)
			System.out.println(x+" is even");
		else
			System.out.println(x+" is odd");
		
		

	}

}
