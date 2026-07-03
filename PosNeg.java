import java.util.Scanner;
class PosNeg
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value :");
			int a=sc.nextInt();
			if(a>0)
			{
				System.out.println("Positive");
			}
			else if(a<0)
			{
				System.out.println("Negtive");
			}
			else
			{
				System.out.println("Zero");
			}
	}
}