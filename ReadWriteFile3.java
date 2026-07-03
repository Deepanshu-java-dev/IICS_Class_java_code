import java.io.*;
class ReadWriteFile3
{
	public static void main(String[] args)
	{
		try
		{
			BufferedReader reader=new BufferedReader(new FileReader("Data3.txt"));
			BufferedWriter Writer=new BufferedWriter(new FileWriter("ouput1.txt"));
			
				String line;
				int lineCount=0;
				int wordCount=0;
				int charCount=0;
				while((line=reader.readLine())!=null)
				{
					lineCount++;
					
					charCount=charCount+line.length();
					
					String[] words= line.split("\\s+");
					wordCount= wordCount+ words.length;
				}
				System.out.println("Lines:"+lineCount);
				System.out.println("Words:"+wordCount);
				System.out.println("Characters:"+charCount);
		}
		catch(IOException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	
	}
} 