class Arrayques8
{
	public static void main(String[] args )
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int b= 14;
		int i,f=0 ;
		for(i=0; i<10;i++)
		{
			if (b==a[i])
			{
				f=1;
				break;
			}
		}
		if (f==1)
		{
			System.out.println("Data found");
		}
		else{
			System.out.println("Data not found");
		}
	}
}