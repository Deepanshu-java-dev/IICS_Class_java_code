import java.util.Scanner;
class PackArea
{
	public static void main(String[]args)
	{
		int l;
		int b;
		int area;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an l value:");
		l=input.nextInt();
	System.out.print("Enter an b value:");
		b=input.nextInt();
		area=l*b;
	System.out.println("Area of triangle:"+area);
	System.out.print("the value you entered are");
	System.out.print(l+"*" +b +"=" + area );
	}
}