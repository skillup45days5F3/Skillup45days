package pack4;

import java.util.Scanner;

class Bank
{
  String name;
  int acc_no;
  
  Bank()  // constructor with no args
  {
	  Scanner c=new Scanner(System.in);
	  System.out.println("Enter your name:");
	  name=c.next();
	  System.out.println("Enter account no:");
	  acc_no=c.nextInt();
  }
  
  Bank(String name)  //constructor with 1 arg
  {
	  Scanner c=new Scanner(System.in);
	  this.name=name;
	  System.out.println("Enter account no:");
	  acc_no=c.nextInt();
  }
  Bank(String name, int acc_no)
  {
	  this.name =name;
	  this.acc_no=acc_no;
  }	    
  void Show()
  {
	  System.out.println("name = "+name+",acc_no = "+acc_no);
	 
  }
}
public class Over_loaded_constructor1 
{

	public static void main(String[] args)
	{
		Bank obj1 = new Bank();
		obj1.Show();
		Bank obj2 = new Bank("varsha");
		obj2.Show();
		Bank obj3 = new Bank("Rama",10122);
		obj3.Show();
	}

}
