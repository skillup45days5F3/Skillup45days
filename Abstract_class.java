package pack5;
abstract class Transport
{
	void Color()
	{
		System.out.println("red");		
	}	
abstract int Wheels();   // abstract method	
}
class Car extends Transport
{
	int Wheels()
	{
		return 4;
	}
}
class Bike extends Transport
{
	int Wheels()
	{
		return 2;
	}
}
public class Abstract_class 
{

	public static void main(String[] args) 
	{
		Car obj = new Car();
		obj.Color();
		System.out.println("car has "+ obj.Wheels()+ " wheels");
		 Bike obj2 = new Bike();
		System.out.println("bike has " + obj2.Wheels()+ " wheels ");
	    obj2.Color();
	}

}
