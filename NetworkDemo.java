import java.net.*;
class NetworkDemo
{
	public static void main(String[] args)
	{
		try
		{
		InetAddress ip=  InetAddress.getLocalHost();
		System.out.println("Your IP Address is :"+ ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}