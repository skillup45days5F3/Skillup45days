package pack2_looping_statements;

public class For_loop5 {

	public static void main(String[] args) {
		System.out.println("to display multiple rows and columns:");
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<='E';j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
