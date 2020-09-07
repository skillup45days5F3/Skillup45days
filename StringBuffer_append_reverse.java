package pack5;

public class StringBuffer_append_reverse 
{

	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("sushma");
		System.out.println("old data : "+ sb1);
		sb1 = sb1.append(" kaniti");
		System.out.println("new data :"+sb1);
		StringBuffer sb2 = new StringBuffer("sushma");
		System.out.println("reverse = "+sb2.reverse());

	}

}
