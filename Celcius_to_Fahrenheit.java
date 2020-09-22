package Formula_prgs;

import java.util.Scanner;

public class Celcius_to_Fahrenheit {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		float f,c;
		System.out.println("enter Celcius temperature:");
		c=s.nextFloat();
		f=((c*9)/5)+32;
		System.out.println("Fahrenheit="+f);
		
	}

}
