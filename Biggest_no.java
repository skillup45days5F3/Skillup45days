package pack2_looping_statements;

import java.util.Scanner;

public class Biggest_no 
{

	public static void main(String[] args)
	{
		Scanner o=new Scanner(System.in);
		System.out.println("enter any 4 no's:");
		float a=o.nextFloat();
		float b=o.nextFloat();
		float c=o.nextFloat();
		float d=o.nextFloat();
		if (a>b&&a>c&&a>d)
			System.out.println("the biggest no:"+a);
		else if (b>c&&b>d)
			System.out.println("the biggest no:"+b);
		else if(c>d)
			System.out.println("the biggest no:"+c);
		else
			System.out.println("the biggest no:"+d);
			
			
		

	}

}
