package pack1;

import java.util.Scanner;

public class area_of_triangle
{

	public static void main(String[] args)
	{
		System.out.println("AREA OF TRIANGLE");
		Scanner T=new Scanner(System.in);
		System.out.println("Enter value of base of triangle:");
		double b=T.nextDouble();
		System.out.println("enter height of triangle:");
		double h=T.nextDouble();
		double area=b*h/2;
		System.out.println("Area of triangle:"+area);

	}

}
