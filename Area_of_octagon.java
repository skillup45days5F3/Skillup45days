package pack1;

import java.util.Scanner;

public class Area_of_octagon {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter length of a side :");
		float s = obj.nextFloat();
		float a = (float)(2*(1+Math.sqrt(2))*s*s);
	    System.out.println("Area of Octagon = "+a);

	}

}
