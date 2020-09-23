package Formula_prgs;

import java.util.Scanner;

public class Area_of_Trapezium {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 2 sides:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("enter height:");
		int h=s.nextInt();
		float area=((a+b)*h/2f);          
		System.out.println("Area of Trapezium="+area);
	}

}
