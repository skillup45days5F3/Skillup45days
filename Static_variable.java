package pack5;

public class Static_variable
{
	static int x=10;
	public static void main(String[] args) 
	{
		Static_variable obj = new Static_variable();
		obj.x=50;
		System.out.println(obj.x);  // 50
		Static_variable obj2 = new Static_variable();
	    System.out.println(obj2.x);  //50
	}

}
