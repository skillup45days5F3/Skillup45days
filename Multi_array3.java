package pack3_Arrays;

import java.util.Scanner;

public class Multi_array3 
{

	public static void main(String[] args) 
	{
		 Scanner s= new Scanner(System.in);
		  System.out.println("enter row size:");
		  int r = s.nextInt();  
		  System.out.println("enter column size:");
		  int c = s.nextInt();   
		  
		  int a[][] = new int[r][c];
		  int b[][] = new int[r][c];
		  int sum[][] = new int[r][c];
		  
		  System.out.println("enter "+r+" x "+c+" Matrix-A values:");
		  
		  for(int i=0; i<r; i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  a[i][j] = s.nextInt();
			  }
		  }
   
	System.out.println("enter "+r+" x "+c+" Matrix-B values:");
		  
		  for(int i=0; i<r; i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  b[i][j] = s.nextInt();
			  }
		  }
		  System.out.println("Matrix A is:");
		    for(int i=0; i<r; i++)
			  {
				  for(int j=0;j<c;j++)
				  {
					  System.out.print(a[i][j]+"\t");
				  }
				  System.out.println();
			  }
		 System.out.println("Matrix B is");
		 for(int i=0; i<r; i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  System.out.print(b[i][j]+"\t") ;
			  }
			  System.out.println();
			  
		  } 

	System.out.println("sum of 2 matrices:");
		  
		  for(int i=0; i<r; i++)
		  {
			  for(int j=0;j<c;j++)
			  {
				  sum[i][j] = a[i][j] + b[i][j];
				  System.out.print(sum[i][j]+"\t");
			  }
		 	System.out.println();	  
		  }

	}

}
