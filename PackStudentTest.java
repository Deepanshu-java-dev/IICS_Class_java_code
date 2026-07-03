import java.util.Scanner;
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
class PackStudentTest
{
	public static void main(String [] args)
	{
		Scanner.input=new Scanner(System.in);
	System.out.print("Enter an a value:");
		this.a=input.nextInt();
	System.out.print("Enter an b value:");
		this.b=input.nextInt();
	System.out.print("the value you entered are");
	System.out.print(a +b );
		Student ob = new Student(102,"Deep");
		ob.show();
	}
}

