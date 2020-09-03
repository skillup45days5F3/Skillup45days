package pack4;
class add //parent class
{
	void add(int a,int b)
	{
		System.out.println("addition="+(a+b));
	}
}
class Sub extends add //child class
{
	void sub(int x,int y)
	{
		System.out.println("substraction="+(x-y));
	}
}
public class Inheritence_class 
{

	public static void main(String[] args)
	{
		Sub o=new Sub();
		o.sub(10,20);
		o.add(20,30);
	}

}
