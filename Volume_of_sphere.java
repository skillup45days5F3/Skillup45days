package Formula_prgs;

import java.util.Scanner;

public class Volume_of_sphere {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter radius :");
		int r = obj.nextInt();
		double v = (4/3)*3.14*(r*r*r);
	    System.out.println("Volume of Sphere = "+v);

	}

}
