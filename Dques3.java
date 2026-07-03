class Dques3
{
	public static void main (String[] args)
	{
		int a[][]={{2,4,7},{9,5,6}};
		int b[][]={{4,3},{7,5},{8,10}};
		int c[][]= new int[2][2];
		int i;
		int j;
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]= 0;
				for(int k=0;k<3;k++)
				{
			c[i][j]= a[i][k]*b[k][j];
				}
			}
		}	
		System.out.println("Martix1:");
			for(i=0;i<2;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print("\t"+ a[i][j]);
				}
				System.out.println();
			}
			System.out.println("\nMartix2:");
				for(i=0;i<3 ;i++)
				{
					for(j=0;j<2;j++)
					{
						System.out.print("\t"+ b[i][j]);
					}
					System.out.println();
				}
				System.out.println("\nMartix3");
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							System.out.print("\t"+c[i][j]);
						}
						System.out.println();
					}
	
			
	} 

}