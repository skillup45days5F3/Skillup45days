package pack1;

import java.util.Scanner;

public class Area_of_pentagon {

	public static void main(String[] args) {
		System.out.println("Enter side value of pentagon:");
		Scanner o=new Scanner(System.in);
		float s=o.nextFloat();
		System.out.println("Enter apothem value of pentagon:");
		float a=o.nextFloat();
		System.out.println("Area of pentagon:"+(5*s*a/2));
		

	}

}
