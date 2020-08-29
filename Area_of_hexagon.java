package pack1;

import java.util.Scanner;

public class Area_of_hexagon {

	public static void main(String[] args) 
	{
		System.out.println("Enter side value of hexagon:");
		Scanner o=new Scanner(System.in);
		float a=o.nextFloat();
		System.out.println("Area of hexagon:");
		System.out.printf("%1.4f",(Math.sqrt(3)*3*a*a/2));
		


	}

}
