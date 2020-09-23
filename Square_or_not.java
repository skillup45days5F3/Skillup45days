package Formula_prgs;

import java.util.Scanner;

public class Square_or_not {

	public static void main(String[] args) {
		Scanner o=new Scanner(System.in);
		System.out.println("enter any number:");
		int x=o.nextInt();
		double sr=Math.sqrt(x);
		if((sr-Math.floor(sr))==0)
			System.out.println(x+" is Square number");
		else
			System.out.println(x+" is not a Square Number");
		

	}

}
