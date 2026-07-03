import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
			int n=sc.nextInt();
			int temp=n;
			int sum=0;
	
			while(n>0)
			{
				int digits=n % 10;
				sum=sum+(digits*digits*digits);
				n=n/10;
			}
			if(sum==temp)
			{
				System.out.println("Armstrong Number");
			}
			else
			{
				System.out.println("Not Armstrong Number");
			}
	}
}