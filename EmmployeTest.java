class Employe
{
	int id;
	String name;
	public void getdata(int a, String b)
	{
		id=a;
		name=b;
	}
	public void display()
	{
		System.out.println("Employe Id :"+id);
		System.out.println("Employe Name :"+name);	
	}
}
class EmmployeTest
{
	public static void main(String[] args)
	{
		Employe ob =new Employe();
		ob.getdata(101, "Deep ");
		ob.display();
	}
}

