package pack1;

import java.util.Scanner;

public class Area_of_rhombus 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter diagonal values of rhombus:");
		Scanner o=new Scanner(System.in);
		float a=o.nextFloat();
		float b=o.nextFloat();
		System.out.println("Area of Rhombus:"+(a*b/2));
		

	}

}
