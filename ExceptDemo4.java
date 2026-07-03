import java.util.Random;
class ExceptDemo4
{
	public static void main(String[] args)
	{
		int a=1,b,c;
		Random r=new Random();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Attempt "+(i+1));
			try
			{
				b=r.nextInt(1000);
				c=r.nextInt(1000);
			System.out.println("First value :"+b );
			System.out.println("Second value :"+c );
				a=1234/(b-c);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Divide by 0");
					a=0;
			}
			finally
			{
				System.out.println("Always executed");
			}
			System.out.println("a="+a);
		}	
	}
}

