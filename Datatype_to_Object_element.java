package pack6;

public class Datatype_to_Object_element {

	public static void main(String[] args) {
	int a=20;
	Integer i=Integer.valueOf(a);  //converts int to Integer
	Integer j=a; //autoboxing
	System.out.println("a="+a+" i="+i+" j="+j);

	}

}
