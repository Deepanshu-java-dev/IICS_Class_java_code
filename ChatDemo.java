import java.net.*;
import java.io.*;
class ChatDemo
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss=new ServerSocket(3333);
		Socket s=ss.accept();
		if(s!=null)
			{
				System.out.println("Server Active....");
			}
			else
			{
				System.out.println("Connection Error!!!!!");
			}
	
		DataInputStream din=new DataInputStream(s.getInputStream());
			
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		
		BufferedReader br=new BufferedReader(new 								InputStreamReader(System.in));
		String str="",str2="";
		
			while(!str.equals("stop"))
			{
			str=din.readUTF();
			System.out.println("cilent:"+str);
			str2=br.readLine();
			
			dout.writeUTF(str2);
			
			dout.flush();
			
			}
			//System.out.print("System server : ");
			din.close();
			s.close();
			ss.close();
	}
}