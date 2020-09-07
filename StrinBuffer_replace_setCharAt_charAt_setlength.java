package pack5;

public class StrinBuffer_replace_setCharAt_charAt_setlength {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This were a test");
		sb.replace(5, 9, "is");
		System.out.println(sb);
		StringBuffer sb1 = new StringBuffer("Hello");
		  
		System.out.println(sb1.charAt(1)); // e
		
		sb1.setCharAt(1, 'i');
		System.out.println(sb1);  // Hillo
		
		sb1.setLength(2);
		System.out.println(sb1);  // Hi

	}

}
