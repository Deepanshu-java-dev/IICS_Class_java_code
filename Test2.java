class Test2
{
		{
			System.out.println("Anonymous block");
		}
		Test2()
		{
			System.out.println("hello");
		}
		static 
		{
			System.out.println("This static block");
		}
	public static void main(String[]args)
	{
		Test2 ta =new Test2();
		
	}
}