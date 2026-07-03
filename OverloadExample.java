class Overload
{
	int id;
	String name;

	Overload()
	{
	System.out.println("This Default construtor");
	}
	Overload(int a,String b)
	{
	System.out.println("This is parameterize construtor");
		id=a;
		name=b;
	System.out.println("Id :"+id);
	System.out.println("Name :"+name);
	}
}
class OverloadExample
{
	public static void main(String[] args)
	{
	Overload ob= new Overload();
	Overload ob1= new Overload(011,"Deep");
	}
}
