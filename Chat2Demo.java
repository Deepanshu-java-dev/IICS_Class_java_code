import java.net.*;
import java.io.*;
class Chat2Demo
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("localhost",3333);
			if(s!=null)
			{
				System.out.println("Client Online....");
			}
			else
			{
				System.out.println("Connection Error!!!!!");
			}
			
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		System.out.print("Me : ");
		BufferedReader br=new BufferedReader(new 								InputStreamReader(System.in));
		String str="",str2="";
		
			while(!str.equals("stop"))
			{
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2=din.readUTF();
			System.out.println("server:"+str2);
			}
			din.close();
			s.close();
	}
}