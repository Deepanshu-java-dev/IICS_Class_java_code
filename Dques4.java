class Dques4
{
	public static void main (String[] args)
	{
		int a[][]= {{4,7,9},{4,2,3},{9,7,9}};
		int sum= 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum = sum + a[i][j];
			}
		}
		System.out.println("Sum of all elements = "+ sum);
	} 

}