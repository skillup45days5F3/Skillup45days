package pack6;
//outer class with inner class

class Outer_class
{
	int num=10;
	
	private class Inner_class        //inner class
	{
		int x=20;
		public void print()
		{
			System.out.println("inner class :"+num);
		}
	}
	//Accessing inner class
	void display_inner()
	{
		Inner_class obj=new Inner_class();
		obj.print();
		System.out.println("inner class value from outer class:"+obj.x);
	}
}//outer class
public class Inner_Class 
{

	public static void main(String[] args) 
	{
		Outer_class obj=new Outer_class();
		obj.display_inner();

	}

}
