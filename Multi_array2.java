package pack3_Arrays;

import java.util.Scanner;

public class Multi_array2 {

	public static void main(String[] args) {
		 Scanner s = new Scanner (System.in);
		  System.out.println("enter row size:");
		  int r = s.nextInt();   
		  System.out.println("enter column size:");
		  int c = s.nextInt();  
		  
		  int a[][] = new int[r][c];
		  
		  System.out.println("enter "+r+" x "+c+" array values:");
		  
		  for(int i=0; i<r; i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  a[i][j] = s.nextInt();
			  }
		  }
		  
		  System.out.println("Matrix Array values:");
		  for(int i=0; i<r; i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  System.out.print(a[i][j]+"\t");
			  }
			  System.out.println();
		  }
		  System.out.println("Transpose Matrix Array values:");
		  for(int i=0; i<c; i++)
		  {
			  for(int j=0;j<r;j++)
			  {
				  System.out.print(a[j][i]+"\t");
			  }
			  System.out.println();
		  }

	}

}
