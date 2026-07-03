import java.util.Scanner;
class Sumofdigits
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter of value:");
			int n=sc.nextInt();
			int sum=0;
		while(n>0)
		{
			int digits=n%10;
			sum=sum+digits;
			n=n/10;
		}
		System.out.println("Add of sum:"+sum);
	}
}