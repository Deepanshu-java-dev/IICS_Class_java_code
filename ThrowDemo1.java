import java.util.Scanner;
class ThrowDemo1
{
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter String :");
			String str=input.nextLine();
			int Length=str.length();
				if(Length<4)
				{
					throw new ArithmeticException("invalid");
				}
				else
				{
					System.out.println("Welcome to Website");
				}
				System.out.println(Length);
				
		
	}
}