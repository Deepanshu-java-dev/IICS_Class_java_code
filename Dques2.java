class Dques2
{
	public static void main (String[] args)
	{
	int a[][] = {{12,54,65,76},{47,69,56,67},{98,44,55,65}};
	int b[][] = {{12,13,51,23,},{23,25,65,56},{67,66,77,55}};
	int c[][]= new int[3][4];
	int i;
	int j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			c[i][j]= a[i][j]+b[i][j];
		}
	}
	
	System.out.print("Array1");
		for(i=0; i<3;i++)
		{
			for(j=0;j<4;j++)
			{
			System.out.print("\t"+a[i][j]);		
			}
		
			System.out.println();
		}
		System.out.println("Array 2");
			for(i=0;i<3;i++)
			{
				for(j=0;j<4;j++)
				{
				System.out.print("\t"+ b[i][j]);
				}
			
			System.out.println();
			}
		System.out.println("Array 3");
			for(i=0; i<3;i++)
			{
				for(j=0;j<4;j++)
				{
				System.out.print("\t"+c[i][j]);
				}	
			System.out.println();
			}
		
			
	} 

}