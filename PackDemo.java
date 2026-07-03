import java.util.Scanner;
class PackDemo
{
	public static void main(String[] args )
	{
		int a;
		int b;
		int sum;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an a value :");
		a=input.nextInt();
	System.out.print("Enter an b value :");
		b=input.nextInt();
		sum=a+b;
	System.out.println("Sum of a and b:"+sum);
	System.out.println("The value you entered are");
	System.out.println(a+ " +"+b +"="+sum);
	}
}