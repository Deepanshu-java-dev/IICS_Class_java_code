import java.lang.String;
class StringDemo
{
	public static void main(String [] args)
	{
		String s=new String("Deepanshu");
		if((s.isEmpty()))
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("Not Empty");	
		}

		System.out.println("No of character : "+(s.length()));
		s.trim();
		System.out.println("No of character after trim: "+(s.trim()));
		System.out.println("Concatenation : "+(s.concat(" Kumar")));
		System.out.println("Replace: "+(s.replace("p","v")));
	}
}