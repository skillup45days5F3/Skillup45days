package pack1;

import java.util.Scanner;

public class area_of_square 
{

	public static void main(String[] args)
	{
		System.out.println(" AREA OF SQUARE ");
		Scanner A=new Scanner(System.in);
		System.out.println("Enter value of side of the square: ");
		double side=A.nextDouble();
		double area=side*side;
		System.out.println("Area of square is:"+area);

	}

}
