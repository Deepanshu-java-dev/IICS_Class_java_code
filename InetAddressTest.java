

import java.net.*;
class InetAddressTest
{
	public static void main(String[] args)
	{
		try
		{
		InetAddress ip=  InetAddress.getByName("www.youtube.com");
		System.out.println("Host name  :"+ ip.getHostName());

		System.out.println("Host Address :"+ ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}