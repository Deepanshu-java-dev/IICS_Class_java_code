class Commandques7
{
	public static void main(String []args)
	{
		
		if(args.length ==0)
		{
		System.out.println("Please provide a number as a command line 								argument.");
			return;
		}
			int num = Integer.parseInt(args[0]);
			System.out.println("write Even and odd "+":");
				if (num%2==0)
				{
				System.out.println("Even");		
				}
				else
				{
				System.out.println("Odd");
				}
			
	}
}