package pack2_looping_statements;

public class For_loop6 {

	public static void main (String[] args) {
		System.out.println("to display multiple rows and columns:");
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}

}
