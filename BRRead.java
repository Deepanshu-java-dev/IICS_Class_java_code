import java.io.*;	lass BRRead
{
	public static void main(String[] args) throws IOException
	{
		char e;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter character q to quit");
			do
			{
				e=(char)br.read();
				System.out.println(e);
			}
			while(e!='q');
	}
}