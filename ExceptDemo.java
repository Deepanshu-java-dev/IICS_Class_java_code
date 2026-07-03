class ExceptDemo
{
	public static void main(String []args)
	{
		int a=12;
		int b=0;
		int c;
		try
		{
		c=a/b;
		System.out.println("Result : "+c);  
		}
		catch(Exception e)
		{
			System.out.println("Number cannot be divide by zero");
		}
		
	}
}