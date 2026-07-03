import java.io.*;
class ReadData
{
	public static void main(String[]args)
	{
 		File in = new File("Mydata.txt");
		try
		{
			FileReader ins =new FileReader(in);
			System.out.println("Welcome to java file");
			int ch;
			int count=0;
			while((ch=ins.read())!=-1)
			{
				System.out.println((char)ch);
					
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
					System.out.println("vowel ="+(char)ch);
				}
				
			}	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		catch(IOException e)
		{
			System.out.println("Error:"+e);
		}
	}
}