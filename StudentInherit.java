class Student
{
	int id; 
	String name;
	void getdata()
	{
		id=101;
		name= "Ashu";
	}
	void showdata()
	{
		System.out.println("Student Id :" +id);
		System.out.println("Student Name :" +name);
	}
}
class Test extends Student
{

  int maths,english,physics,chemistry;
	void getemarks()
	{
		maths=77;
		english=78;
		physics=80;
		chemistry=81;	
	}
	void showmarks()
	{
		System.out.println("Maths marks :" +maths);
		System.out.println("English marks :" +english);
		System.out.println("Physics marks :" +physics);
		System.out.println("Chemistry marks :" +chemistry);
	}
	void result()
	{
		int total= maths + english + physics + chemistry;
		int avg= total/4;
		System.out.println("Total marks:" +total);
		System.out.println("Average marks :" +avg);
	}
}
class StudentInherit
{
	public static void main(String args [])
	{
		Test ob = new Test();
		ob.getdata();
		ob.showdata();
		ob.getemarks();
		ob.showmarks();
		ob.result();
	}
}