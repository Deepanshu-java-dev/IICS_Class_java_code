class PracticeSloving6
{
	int id;
	String name;
	PracticeSloving6(int i, String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("Name:"+name);
	}
	public static void main(String[]args)
	{
		PracticeSloving6 s1=new PracticeSloving6(101,"Deep");
			s1.display();
	}
}