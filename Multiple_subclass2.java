package pack4;
class A2  // composition or sub class
{
	public void sum(int x , int y)
	{
		System.out.println("sum = " + (x+y));
	}
}

class B2
{
	public void sub(int a, int b)
	{
		A2 obj = new A2();
		 obj.sum(20,10);
		System.out.println("sub = "+ (a-b));
	}
}

public class Multiple_subclass2 
{

	public static void main(String[] args)
	{
		 B2 obj2 = new B2();
		 obj2.sub(30, 10);
		 System.out.println("Main class");

	}

}
