import java.io.*;
class WriteBytes
{
	public static void main(String[] args)
	{
		byte cities[]={'D','E','L','H','I','\n','L','O','N','D','O','N'};
		FileOutputStream outfile=null;
		try
		{
			outfile =new FileOutputStream("city.txt");
			outfile.write(cities);
			outfile.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.out.println(-1);
		}
	}
}