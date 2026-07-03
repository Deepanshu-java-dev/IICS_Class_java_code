class Commandques2
{
	public static void main(String []args)
	{
		
			int num = Integer.parseInt(args[0]);
			System.out.println("Multiplication Table of"+ num +":");
				for(int i=1;i<=10;i++)
				{
				System.out.println(num + "x" + i + "=" +(num*i));
				}
	}
}