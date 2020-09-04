package pack4;
class Student3   // parent class
{
	String name;   // class var
	int rn;
	
	Student3(String name, int rno)  // parent class constructor with 2 args
	{
		this.name =  name; // this.name is class var
		rn = rno;
	}
	
	void showStudent()
	{
		System.out.println("name = "+name +" ,rollno = "+rn);  //class var
	}
}
class Marks1 extends Student3  // child1 class
{
	int m1,m2;  // class var
	Marks1(String name, int rn, int m1, int m2)  //constructor with 4 args
	{
		super(name,rn);   // parent class constructor gets executed
		this.m1 = m1;
		this.m2= m2;
	}
	void showMarks()
	{
		System.out.println("m1 = "+m1+" ,m2 = "+m2);
	}
}

class Marks2 extends Student3  // child2 class
{
	int m3,m4;  // class var
	Marks2(String name, int rn, int m3, int m4)  //constructor with 4 args
	{
		super(name,rn);   // parent class constructor gets executed
		this.m3 = m3;
		this.m4 = m4;
	}
	void showMarks()
	{
		System.out.println("m3 = "+m3+",m4 = "+m4);
	}
}

public class Hierarchical_inheritance {

	public static void main(String[] args)
	{
	      Marks1 obj = new Marks1("sushma",10,67,78);
		  obj.showStudent();
		  obj.showMarks();
		  Marks2 obj2 = new Marks2("sushma",10,87,92);
		  obj2.showStudent();
		  obj2.showMarks();

	}

}
