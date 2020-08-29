package pack1;
import java.util.*;

public class Student_details
{

	public static void main(String[] args) 
	{
		Scanner o=new Scanner(System.in);
		System.out.println("enter your name:");
		String sname=o.next();
		System.out.println("enter your rollno:");
		int sno=o.nextInt();
		System.out.println("enter your age:");
		byte age=o.nextByte();
		System.out.println("enter your fee:");
		float fee=o.nextFloat();
		System.out.println("Student Details:"+"\n---------------");
		System.out.println("Name:"+sname+"\nRollno:"+sno+"\nAge:"+age+"\nFee:"+fee);	        
	}

}
