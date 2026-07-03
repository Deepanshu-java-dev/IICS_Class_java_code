class nested_loopquestion4
{
	public static void main(String[] args)
	{
		int i= 0;
		int j= 0;
		for(i=1; i<=5; i++)
		{

		for(j=5; j>=i; j--){

			System.out.print(i);
		}
		System.out.println();
		}
	}
}