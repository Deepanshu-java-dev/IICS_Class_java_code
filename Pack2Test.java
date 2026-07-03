import java.util.Scanner;
import Findout.Pack2;
class Pack2Test
{
	public static void main(String[]args)
	{
		Pack2 pe= new Pack2();
	Scanner input= new Scanner(System.in);
	System.out.println("Arithmetic Operation\n 1. Reactangle \n 2. Square \n 3. Triangle \nEnter your choice :  ");
		int a=input.nextInt();
		System.out.println("Enter First Number : ");
		int x=input.nextInt();
		System.out.println("Enter Second Number : ");
		int y=input.nextInt();
		if(a==1)
		{
			pe.rect(x,y);
		}
		
		else if(a==2)
		{
			pe.square(x);
		}
		
		else if(a==3)
		{
			pe.triangle(x,y);
		}
		else
		{
		System.out.println("Invalid chooise");
		}
	}
}