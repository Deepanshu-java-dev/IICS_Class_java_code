class Student
{
	int id;
	String name;
	String city;
	Student(int id,String name)
	{
	this.id=id;
	this.name=name;	
	}
	Student(int id,String name,String city)
	{
		this(id,name);
		this.city=city;
	}
	void show()
	{
	System.out.println(id+""+name+""+city);
	}
}
class StudentTest2
{
	public static void main(String[]args)
	{
	Student ob1=new Student(111,"Deep");
	Student ob2=new Student(111,"Deep","Delhi");
	ob1.show();
	ob2.show();
	}
}

