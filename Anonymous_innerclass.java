package pack6;
abstract class AnonymousInner
{
	public abstract void myMethod();
}
public class Anonymous_innerclass {

	public static void main(String[] args) {
		AnonymousInner inner =new AnonymousInner()  //1- instantiation
		{                           //2-  declaration without classname
			public void myMethod()
			{
				System.out.println("Anonymous Inner Class");
			}
		};  // end of inner class	
	inner.myMethod();  // calling method	
	}

}
