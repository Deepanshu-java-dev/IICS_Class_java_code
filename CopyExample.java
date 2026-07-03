class CopyConstrutor
{
	int id;
	String name;
	
	CopyConstrutor(int a, String b)
	{
		id=a;
		name=b;
	}
	CopyConstrutor(CopyConstrutor s)
	{
		id=s.id;
		name= s.name;
	}
	void show ()
	{
	System.out.println("ID :"+id);
	System.out.println("Name :"+name);
	}
}
class CopyExample
{
	public static void main(String[] args)
	{
	CopyConstrutor s1= new CopyConstrutor(1771,"Aarav Tomar");
	CopyConstrutor s2= new CopyConstrutor(s1);
		s1.show();
		s2.show();
	}
}