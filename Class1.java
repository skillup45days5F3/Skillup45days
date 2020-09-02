package pack4;
class A //composition or sub class
{
	public void sum(int x,int y)
	{
		System.out.println("sum="+(x+y));
	}
}
public class Class1
{

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.sum(20,30);
		System.out.println("Main class");

	}

}
