package pack1;
import java.util.*;

public class Area_of_equilateral_triangle 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter side value of equilateral triangle:");
		Scanner o=new Scanner(System.in);
		float a=o.nextFloat();
		System.out.println("Area of equilateral triangle:");
		System.out.printf("%1.4f",(Math.sqrt(3)*a*a/4));
		

	}

}
