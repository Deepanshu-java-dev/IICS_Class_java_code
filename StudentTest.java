class Student
{
	int a;
	String b;
	Student()
	{
		System.out.println("This is default Constructor");
	}
	Student(int a, String b)
	{
		this();                                  
		this.a=a;
		this.b=b;		
	}
	void show()
	{
		System.out.println("ID : "+a);
		System.out.println("Name : "+b);
	}
}
class StudentTest
{
	public static void main(String [] args)
	{
		Student ob = new Student(102,"Deep");
		ob.show();
	}
}

