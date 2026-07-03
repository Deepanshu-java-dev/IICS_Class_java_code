class nested_loopquestion7
{
	public static void main(String[] args)
	{
		int i= 0;
		int j= 0;
		for(i=5; i>=1; i--)
		{

		for(j=5; j>=i; j--){

			System.out.print(j);
		}
		System.out.println();
		}
	}
}