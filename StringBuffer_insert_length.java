package pack5;

public class StringBuffer_insert_length
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("I India");
		sb.insert(2, "Like ");	
		System.out.println(sb);  
		System.out.println(sb.length());

	}

}
