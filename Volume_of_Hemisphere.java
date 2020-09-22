package Formula_prgs;

import java.util.Scanner;

public class Volume_of_Hemisphere
{

	public static void main(String[] args) 
	{
		Scanner o=new Scanner (System.in);
		System.out.println("enter radius of Hemi-sphere:");
		float r=o.nextFloat();
		float v=(float)(3.14*(r*r*r)*2/3);
		System.out.println("Volume of Hemisphere="+v);

	}
}	