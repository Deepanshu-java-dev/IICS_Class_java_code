class Demo
{
	Demo()
	{
		System.out.println("Constructor called");
	}
	void show()
	{
		System.out.println("Method called");
	}	
}
class PracticeSloving7
{
	public static void main(String[]args)
	{
		System.out.println("Main start");
		Demo ob=new Demo();
			ob		.show();
		System.out.println("Main end");
	}
}