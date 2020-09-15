package pack6;

public class Objectvalue_to_var {

	public static void main(String[] args) {
		//to store value in object
				Integer a=new Integer(4);
				//to convert object value into var
				int i=a.intValue();
				int j=a;      //unboxing
				System.out.println("a="+a+" i="+i+" j="+j);

	}

}
