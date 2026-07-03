import java.io.*;
class ReadData1
{
	public static void main(String [] args)
	{
		File in =new File("numbers.txt");
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("numbers.txt"));
			int count=0;
			while(br.readLine()!=null)
			{
				count++;
			}
			System.out.println("Total line :"+count);
		}
		catch(IOException e)
		{
			System.out.println("Error :"+e);
		}
	}
}