package Formula_prgs;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        System.out.println("enter p,r,n:");
        int p=obj.nextInt();
        int r=obj.nextInt();
        int n=obj.nextInt();
        int si=(p*r*n)/100;
        System.out.println("Simple Interest="+si);
	}

}
