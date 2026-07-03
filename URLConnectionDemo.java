import java.net.*;
import java.io.*;
class URLConnectionDemo
{
	public static void main(String[] args) throws Exception
	{
			URL u1=new URL("https://blogshala.in/mytest.txt");
			URLConnection u2= u1.openConnection();
			InputStream ins=u2.getInputStream();
			int i;
			while((i=ins.read())!= -1)
			{
				System.out.println((char)i);
			}
	}
}