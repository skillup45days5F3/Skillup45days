package pack2_looping_statements;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("Enter 2 no's:");
		float a=o.nextFloat();
		float b=o.nextFloat();		
		System.out.println("1.Addition");
		System.out.println("2.substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("enter your choice:");
		int ch=o.nextInt();                  //with integers as choice
		switch (ch)
		{
		case 1:
			System.out.println("Addition:"+(a+b));break;
		case 2:
			System.out.println("Substraction:"+(a-b));break;
		case 3:
			System.out.println("Multiplication:"+(a*b));break;
		case 4:
			System.out.println("Division:"+(a/b));break;
		default:
			System.out.println("Error");break;
		}
		
	}

}
