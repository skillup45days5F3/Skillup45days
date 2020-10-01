package Formula_prgs;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner o=new Scanner (System.in);
		System.out.println("enter 2 numbers:");
		int n1=o.nextInt();
		int n2=o.nextInt();
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		int lcm=(n1*n2)/gcd;
		System.out.println("LCM ="+lcm);

	}

}
