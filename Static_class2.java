package pack6;
class Static_class3      //outer class
{
static class Nested_class   //inner class
{
	public void mymethod()
	{
		System.out.println("Static inner class1");
	}
	static class Inner_class
	{
		public void Method2()
		{
			System.out.println("Static inner class2");
		}
	}
}
}
public class Static_class2 {

	public static void main(String[] args) {
		Static_class3.Nested_class obj =new Static_class3.Nested_class();
		obj.mymethod();
		Static_class3.Nested_class.Inner_class obj1=new Static_class3.Nested_class.Inner_class();
		obj1.Method2();

	}

}
