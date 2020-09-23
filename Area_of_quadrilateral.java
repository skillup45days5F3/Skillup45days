package Formula_prgs;

import java.util.Scanner;

public class Area_of_quadrilateral {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter 4 sides:");
		int a=o.nextInt();
		int b=o.nextInt();
		int c=o.nextInt();
		int d=o.nextInt();
        double sp=(a+b+c+d)/2;
        double area=Math.sqrt((sp-a)*(sp-b)*(sp-c)*(sp-d));
        System.out.println("Area of quadrilateral = "+area);
	}

}
