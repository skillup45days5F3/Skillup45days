package Formula_prgs;

import java.util.Scanner;

public class Volume_of_cone {

	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
		  System.out.println("enter radius :");
		  int r = obj.nextInt();
		  System.out.println("enter height :");
		  int h = obj.nextInt();
	      double v = 3.14*(r*r)*h/3;
	      System.out.println("Volume of Cone = "+v);

	}

}
