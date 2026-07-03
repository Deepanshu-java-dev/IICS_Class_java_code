import java.util.Scanner;
class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value:");
			int n=sc.nextInt();
		if(n<=1)
		{
			System.out.println("Not prime");
		}
		else
		{
			boolean isPrime= true;
			for(int i=2;i<=n-1;i++)
			{
				if(n%i==0)
				{
					isPrime= false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not a Prime Number");
			}
		}
	}
}