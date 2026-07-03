import java.util.Scanner;
class wordCount
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter String :");
			String str=input.nextLine();
			int wordcount=0;
				String temp=" ";
			for(int i=0;i<str.length();i++)
			{
				char ch =str.charAt(i);
				if(ch!=' ')
				{
					temp=temp+ch;
				}
				else 
				{
					if(!temp.equals(""))
					{
						System.out.println("Word :"+temp);
							wordcount++;
							temp=" ";
					}				
				}
				
			}
			if(!temp.equals(""))
			{
				System.out.println("Word :"+temp);
					wordcount++;
			}	
	}
}