package pack5;

public class StringBuffer_delete_deleteCharAt 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("This is a Test");
		System.out.println(sb.delete(4, 7));  // upto 7
		System.out.println(sb.deleteCharAt(0));

	}

}
