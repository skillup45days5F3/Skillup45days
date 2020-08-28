package pack1;

import java.util.Scanner;

public class area_of_circumference
{

	public static void main(String[] args)
	{
		
		System.out.println("TO PERFORM AREA OF CIRCUMFERENCE");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		double r=obj.nextDouble();
		double area=2*r*22/7;
		System.out.println("Area of circumference:"+area);	
	}

}
