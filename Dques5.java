class Dques5
{
	public static void main (String[] args)
	{
		int a[][]= {{4,7,9},{4,2,3},{9,7,9}};
		int b[][]={{1,2,5},{4,4,5},{8,8,8}}; 
		int sum= 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum = sum + a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of all elements = "+ sum);
	} 

}