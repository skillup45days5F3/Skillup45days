package pack6;

class Static_class1       //outer class
{
static class Nested_class   //inner class
{
	public void mymethod()
	{
		System.out.println("Static nested class");
	}
}
}
public class Static_class      //main class
{
	public static void main(String[] args)    //main method
	{
		Static_class1.Nested_class obj =new Static_class1.Nested_class();
		obj.mymethod();
	}
	

}
