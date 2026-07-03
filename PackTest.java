import java.util.Scanner;
import Arithmatic.Pack1;
class PackTest
{
	public static void main(String[]args)
	{
		Pack1 pa= new Pack1();
	Scanner input= new Scanner(System.in);
	System.out.println("Arithmetic Operation\n 1. Addition \n 2. subtraction \n 3. Multiplication \n 4. Division \nEnter your choice :  ");
		int a=input.nextInt();
		System.out.println("Enter First Number : ");
		int x=input.nextInt();
		System.out.println("Enter Second Number : ");
		int y=input.nextInt();
		if(a==1)
		{
			pa.add(x,y);
		}
		
		else if(a==2)
		{
			pa.sub(x,y);
		}
		
		else if(a==3)
		{
			pa.mul(x,y);
		}
		
		else if(a==4)
		{
			pa.divide(x,y);
		}
		else
		{
		System.out.println("Invalid chooise");
		}
	}
}