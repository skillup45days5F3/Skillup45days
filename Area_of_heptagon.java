package pack1;

import java.util.Scanner;

public class Area_of_heptagon {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter side length of heptagon:");
		int s=obj.nextInt();
		float a=3.634f*s*s;
		System.out.println("Area of Heptagon:"+a);

	}

}
