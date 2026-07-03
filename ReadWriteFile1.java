import java.io.*;
class ReadWriteFile1
{
	public static void main(String[]args)
	{
		String inputFile= "input1.txt";
		String outputFile= "output1.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) 
		{
	
        	    	String line;

           		 while ((line = reader.readLine()) != null) 
			{
				line=line.replace("e","i");
				writer.write(line);
                		writer.newLine();
            		}
        		System.out.println("Word Replace successfully!");
		}
         	catch (IOException e) 
		{
            		System.out.println("Error: " + e.getMessage());
       		}		
	}
}
method 2
import java.io.*;
class ReadWriteFile
{
	public static void main(String[]args)
	{
		try
		{
			BufferedReader reader=new BufferedReader(new FileReader("input1.txt"));
			BufferWriter Writer=new BufferedReader(new FileWriter("ouput1.txt"));
			
				String line;
				while((line=reader.readLine())!=null)
				{
					line =line.replace("i","e");
					writer.write(line);
					writeer.newLine();
				}
				System.out.println("Word Replace Successfully.");
		}
		catch(IO Exception e)
		{
			System.out.println("Error:"+e.getMessage());
		}
	}
}