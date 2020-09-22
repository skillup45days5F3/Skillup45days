package Formula_prgs;

import java.util.Scanner;

public class Volume_of_cuboid {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter l.b,h:");
		int l=s.nextInt();
		int b=s.nextInt();
		int h=s.nextInt();
		int v=l*b*h;
		System.out.println("Volume of Cubiod="+v);

	}

}
