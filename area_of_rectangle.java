package pack1;

import java.util.Scanner;

public class area_of_rectangle
{

	public static void main(String[] args) 
	{
		System.out.println("To perform Area of Rectangle");
		Scanner R=new Scanner(System.in);
		System.out.println("Enter length of rectangle:");
		int l=R.nextInt();
		System.out.println("Enter breadth of rectangle:");
		int b=R.nextInt();
		int area=l*b;
		System.out.println("Area of rectangle:"+area);

	}

}
