import java.util.Scanner;
class LargestNoLogic
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr value of a :");
			int a=sc.nextInt();
		System.out.println("Enetr value of b :");
			int b=sc.nextInt();
			if(a>b)
			{
				System.out.println(" A is Largest");
			}
			else if(b>a)
			{
				System.out.println("B is Largest");
			}
			else if(a==b)
			{
				System.out.println("Both is equal");
			}
	}
}
