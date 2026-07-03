import java.util.Scanner;
import java.lang.String;
class StringQues1
{
	public static void main(String[] args)
	{
		String s= "This is my laptop";
		Scanner input=new Scanner(System.in);
		System.out.println("Replace Alphabat :");
		String a=input.next();
		System.out.println("With Replace Alphabat:");
		String b=input.next();
		System.out.println("Replace: "+(s.replace(a,b)));
	}
}