package pack2_looping_statements;

public class For_loop4 {

	public static void main(String[] args)
	{
		System.out.println("to display multiple rows and columns:");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
