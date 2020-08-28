package pack1;

import java.util.Scanner;

public class area_of_circle 
{

	public static void main(String[] args) 
	{
		System.out.println("TO PERFORM AREA OF CIRCLE:");
		Scanner O=new Scanner(System.in);
		System.out.println("enter radius of circle:");
		double r=O.nextDouble();
		double area=r*r*22/7;
		System.out.println("Area of circle:"+area);
		System.out.printf("%1.2f",area);

	}

}
