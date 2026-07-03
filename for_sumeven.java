class for_sumeven
{
	public static void main(String[] args)
	{
		int a;
		int sum = 0; 
		for(a=1; a<=10; a++)
		{
			if(a%2==0)
			{
				sum=sum+a;
			} 
		}
			System.out.println(sum);
	}
}