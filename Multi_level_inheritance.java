package pack4;
class Student4  //parent class
{
	String name;  // class var
	int rollno;
	
	Student4(String name , int rn)  // parent class constructor
	{
	  this.name = name;  // initializing var with 'this' keyword
	  rollno = rn;
	}
	void Display()  // method of output from class var
	{
		System.out.println("name = "+name+" ,rollno = "+rollno);
	}
}

class Marks3 extends Student4  // child class
{
	int m1,m2;
	Marks3(String name , int rn, int m1, int m2)  // parent class constructor
	{
		super(name,rn);
		this.m1 = m1;
		this.m2 = m2;		
	}
	void Display1()
	{
		System.out.println("m1 ="+m1+" ,m2 = "+m2);
	}
}
class Marks4 extends Marks3 // child class derived from above child class
{
	int m3,m4;
	Marks4(String name,int rn,int m1,int m2,int m3,int m4)
	{
		super(name,rn,m1,m2);
		this.m3 = m3;
		this.m4 = m4;		
	}
	void Display2()
	{
		System.out.println("m3 = "+m3+" ,m4 = "+m4);
	}
}
public class Multi_level_inheritance 
{

	public static void main(String[] args)
	{
		Marks4 obj = new Marks4("sushma",11,56,67,78,89);	
		obj.Display();
		obj.Display1();
		obj.Display2();
	}

}
