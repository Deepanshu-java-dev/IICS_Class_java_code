import java.io.*;
class ReadWriteFile2
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader1=new BufferedReader(new FileReader("Data1.txt"));
			BufferedReader reader2=new BufferedReader(new FileReader("Data2.txt"));
			BufferedWriter Writer=new BufferedWriter(new FileWriter("merged.txt"));
			
				String line;
				while((line=reader1.readLine())!=null)
				{
					Writer.write(line);
					Writer.newLine();
				}
				while((line=reader2.readLine())!=null)
				{
					Writer.write(line);
					Writer.newLine();
				}
				reader1.close();
				reader2.close();
				Writer.close();

				System.out.println("Merged Successfully.");
		}
		catch(IOException e)
		{
			System.out.println("Error:"+e.getMessage());
		}

	}
}