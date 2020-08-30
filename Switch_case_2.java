package pack2_looping_statements;

import java.util.Scanner;

public class Switch_case_2 
{

	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		System.out.println("Enter 2 no's:");
		float a=o.nextFloat();
		float b=o.nextFloat();		
		System.out.println("a.Addition");
		System.out.println("b.substraction");
		System.out.println("c.Multiplication");
		System.out.println("d.Division");
		System.out.println("enter your choice:");
		String ch=o.next();                 //with alphabet as choice
		switch (ch)
		{
		case "a":
			System.out.println("Addition:"+(a+b));break;
		case "b":
			System.out.println("Substraction:"+(a-b));break;
		case "c":
			System.out.println("Multiplication:"+(a*b));break;
		case "d":
			System.out.println("Division:"+(a/b));break;
		default:
			System.out.println("Error");break;

	}

	}
	}
