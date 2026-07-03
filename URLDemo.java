import java.net.*;
class URLDemo
{
	public static void main(String[] args)
	{
		try
		{
		URL ul=new URL("https://blogshala.in/mytest.txt");
		System.out.println("Protocal  :"+ ul.getProtocol());
		System.out.println("Host Address :"+ ul.getHost());
		System.out.println("Port :"+ ul.getPort());
		System.out.println("Path :"+ ul.getFile());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}