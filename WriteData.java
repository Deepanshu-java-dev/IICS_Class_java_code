import java.io.*;
class WriteData
{
	public static void main(String[]args)
	{
		try
		{
			FileWriter ins=new FileWriter("abc.txt");
			System.out.println("Welcome to java file");
				String sc= "Welcome to java Datafile";
				ins.write(sc);
		}
		catch(IOException e)
		{
			System.out.println(" Can not create file");
		}
				
	}
}