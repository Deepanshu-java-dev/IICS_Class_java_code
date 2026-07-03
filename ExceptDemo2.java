class ExceptDemo2
{
	public static void main(String[] args)
	{
		int invalid=0;
		int number; 
		 int count=0;
		for(int i=0;i<args.length;i++)
		{
			try
			{	
				number=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)
			{
				invalid= invalid+ 1;
			System.out.println("Invalid No ="+args[i]);
			continue;
			}
			finally
			{
			System.out.println("Always Executed");
			}
			count=count+1;
		}
		System.out.println("Valid Number:"+count);
		System.out.println("Invalid Number:"+invalid);
	}
}