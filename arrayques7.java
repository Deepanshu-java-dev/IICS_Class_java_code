class Arrayques7
{
	public  static void main (String [] args)
	{
		int a[] ={3,6,4,4,5}; 
		int b[] ={1,2,3,4,5};
		int c[] = new int[5];
		int i ;
		for(i=0;i<5; i++)
		{
			c[i]=a[i]+b[i];
		}
		 System.out.println("Array1");
    		for(i=0; i<5;i++)
		{
			System.out.print("\t"+a[i]);
		}
		System.out.println("\nArray2");
		for(i=0;i<5;i++)
		{
			System.out.print("\t"+b[i]);
		}
		System.out.println("\nArray3");
		for(i=0;i<5;i++)
			{	
			System.out.print("\t"+c[i]);
			}
	}
}