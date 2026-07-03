import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
			int a;
		Scanner input= new Scanner(System.in);
		System.out.println("Enetr Number:");
			   a=input.nextInt();
		System.out.println((a%2==0)?"Even":"odd");
	}
}