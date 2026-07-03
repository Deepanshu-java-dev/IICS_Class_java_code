import java.util.Scanner;
class UpperLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String");
			String str=sc.nextLine();
			int upperCount=0;
			int lowerCount=0;
			String result="";
			for(int i=0;i<str.length();i++)
			{
				char ch = str.charAt(i);
				if(ch>='A'&& ch<='Z')
				{
					result=result+(char)(ch+32);
					upperCount++;
					
				}
				else if(ch>='a'&& ch<='z')
				{
					result=result+(char)(ch-32);
					lowerCount--;
				}
				else{
					result= result+ch;
				}
			}
			System.out.println("Toggel Case :"+result);
			System.out.println("Uppercase letters:"+upperCount);
			System.out.println("Lowercase letters:"+lowerCount);
	}
}