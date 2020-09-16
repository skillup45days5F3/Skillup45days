package pack6;

public class Method_local //outer class
{
	void my_Method()
	{
		int num=20;   
		class MethodInner_class   //inner class
		{
			public void print()
			{
				System.out.println("method local inner class:"+num);
			}
		}
		MethodInner_class obj=new MethodInner_class();
		obj.print();
	}
	public static void main(String[] args) 
	{
		Method_local obj2=new Method_local();
		obj2.my_Method();
		

	}

}
