import java.io.*;
class WriteBytes1
{
	public static void main(String[] args)
	{
		byte words[]={'H','e','l','l','o','\n','W','o','r','l','d'};
		FileOutputStream outfile=null;
		try
		{
			outfile =new FileOutputStream("greeting.txt");
			outfile.write(words);
			outfile.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println(-1);
		}
	}
}