class Parameter
{
	int id;
	String name;
	Parameter(int i,String n)
	{
		id=i;
		name=n;
	}
	void show()
	{
	System.out.println("This is show method");
	System.out.println("ID :"+id);
	System.out.println("Name :"+name);
	}
}
class pzarameterExample
{
	public static void main(String[]args)
	{
	Parameter p= new Parameter(101,"Deepanshu");
	p.show();
	}
}