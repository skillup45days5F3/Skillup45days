package pack4;
class A1
{
	public void sum(int x,int y)
	{
		System.out.println("sum="+(x+y));
	}
}
class B1
{
	public void sub(int a,int b)
	{
		System.out.println("substraction="+(a-b));
	}
}
public class Multiple_subclass1 
{

	public static void main(String[] args) 
	{
		A1 o1=new A1();
		o1.sum(10,20);
		B1 o2=new B1();
		o2.sub(22, 25);
	}

}
