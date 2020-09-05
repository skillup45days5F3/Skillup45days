package pack4;
interface B
{
	void Display1();   // abstract method or empty method
}
interface C
{
	void Display2();
}
class D implements B,C    // 1 child with multiple parents
{
	public void Display1()
	{
		System.out.println("Interface - B");
	}
	public void Display2()
	{
		System.out.println("Interface - C");
	}
}
public class Multiple_Inheritence_interface
{

	public static void main(String[] args) 
	{
		D obj = new D();
	       obj.Display1();
	       obj.Display2();

	}

}
