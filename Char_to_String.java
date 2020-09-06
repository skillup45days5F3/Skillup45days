package pack5;

public class Char_to_String {

	public static void main(String[] args) {
		  char c[] ={'j','a','v','a'};
		  System.out.println("characters:");
		  for(int i=0;i<4;i++)
		  {
			  System.out.println(c[i]);
		  }
		  String s1 = new String(c);	  
		  System.out.println("String : "+s1);
	}

}
