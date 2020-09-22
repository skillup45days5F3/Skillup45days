package Formula_prgs;

import java.util.Scanner;

public class Fahrenheit_to_Celcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float f,c;
		System.out.println("enter Fahrenheit temperature:");
		f=sc.nextFloat();
		c=((f-32)*5)/9;
		System.out.println("Celcius="+c);

	}

}
