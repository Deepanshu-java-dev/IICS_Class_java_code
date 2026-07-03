class parconst
{
	int id;
	String name;
	parconst(int x,String y)
	{
		id=x;
		name=y;	
	}
	void show()
	{	
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
	}
}
class PracticeSloving5
{
	public static void main(String[]args)
	{
		parconst ob=new parconst(1010,"Deepanshu");
			ob.show();
	}
}