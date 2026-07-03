import java.util.Scanner;
class FrequencyofChar
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
			String str=sc.nextLine();
		System.out.println("Enter Character:");
			char ch=sc.next().charAt(0);
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch)
				{
				count=count+1;
				}
			}
			System.out.println(count);
	}
}