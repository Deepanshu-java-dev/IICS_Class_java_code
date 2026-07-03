class Commandques6
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
				for(int i=1;i<100;i++)
			{
				if (i%2==0)
				{
				System.out.println(i);		
				}
				
			}
	}
}