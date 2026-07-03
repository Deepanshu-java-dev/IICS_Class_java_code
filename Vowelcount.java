import java.util.Scanner;
class Vowelcount
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Word :");
		String str=input.nextLine();
				int count=0;
			for(int i=0; i<str.length();i++)
			{
			char ch= str.charAt(i);
				if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
				{
					count++;
				}
			}		
			System.out.println("Vowels Count :"+count);
	}
}