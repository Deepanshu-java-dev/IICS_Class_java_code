class Person
{
	String name;
	int age;
	void showPerson()
	{
	System.out.println("Name :"+name);
	System.out.println("Age:"+age);
	}
}
class Student extends Person
{
	String rollNo;
	void showStudent()
	{
	System.out.println("Student Roll No:"+rollNo);
	}
}
class ResearchStudent extends Student
{
	String researchtopic;
	void showResearch()
	{
	System.out.println("Research Topic :"+researchtopic);
	}
}
class Main 
{
	public static void main(String[] args)
	{
	 ResearchStudent ob=new ResearchStudent();
		ob.name="Ayush";
		ob.age=16;
		ob.rollNo="119665";
		ob.researchtopic="MachineLearning";
		ob.showPerson();
		ob.showStudent();
		ob.showResearch();
	}
}