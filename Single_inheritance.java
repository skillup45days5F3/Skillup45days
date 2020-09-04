package pack4;
class Student2   // parent class
{
	String name;   // class var
	int rn;
	
	Student2(String name, int rno)  // parent class constructor with 2 args
	{
		this.name =  name; // this.name is class var
		rn = rno;
	}
	
	void showStudent()
	{
		System.out.println("name:"+name +" ,rollno:"+rn);  //class var
	}
}
class Marks extends Student2  // child class
{
	int m1,m2;  // class var
	Marks(String name, int rn, int m1, int m2)  //constructor with 4 args
	{
		super(name,rn);   // parent class constructor gets executed
		this.m1 = m1;
		this.m2= m2;
	}
	void showMarks()
	{
		System.out.println("m1:"+m1+" ,m2:"+m2);
	}
}
public class Single_inheritance 
{

	public static void main(String[] args)
	{
		  Marks obj = new Marks("sushma",10,67,78);
		  obj.showStudent();
		  obj.showMarks();
	}

}
