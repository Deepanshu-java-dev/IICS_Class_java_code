import java.util.Scanner;
class StringQues2
{
	public static String reverseString(String s)
	{

		String[] s1=  s.split(" ");
		String result1="";
		for(int i=s1.length-1;i>=0;i--)
		{
			result1 +=(s1[i]+" ");
		}
			return result1;
	}
	public static void main(String args[])
	{
		String str;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter input");
			str=input.nextLine();
		System.out.println(str);
		String result=StringQues2.reverseString(str);
		System.out.println("Reverse String :"+result);
	}

}