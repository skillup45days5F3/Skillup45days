package pack4;
class Student
{
	String name;
	int roll;
	
	Student(String name,int roll_no)
	{
		this.name = name;
		roll = roll_no;
	}
	public void printStudent()
	{
		System.out.println(name);
		System.out.println(roll);
	}	
}
public class Constructor1 
{

	public static void main(String[] args) 
	{
		Student obj = new Student("sushma",12);
		obj.printStudent();
	}

}
