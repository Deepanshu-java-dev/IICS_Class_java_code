import java.util.Scanner;
import java.lang.String;
class ChartDemo
{
	public static void main(String[] args)
	{
		String s= "This is my laptop";
		Scanner input=new Scanner(System.in);
		for(int i=0;i<s.length();i++)
		{
			System.out.println("Character at "+i+" : "+s.charAt(i));
		}
	}
}