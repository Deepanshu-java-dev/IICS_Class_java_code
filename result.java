class Result
{
	public static void main(String[]args)
	{                                                  
		int maths=50;
		int phy=45;
		int chem=45;
		System.out.println("Maths mark:" + maths);
		System.out.println("Physics marks:" + phy);
		System.out.println("Chemistry marks:" + chem);
			int total=maths+phy+chem;
			int avg= total/3;
		System.out.println("Total marks:" + total);
		System.out.println("Average marks:" + avg);

		if(avg>=50)
		{
			if(avg>=85)
			{
				System.out.println("pass with distinction");
			}
			else
			{
				System.out.println("pass");
			}
		}
		else 
		{
			if(avg>=33)
			{
				System.out.println("compartment");	
			}
			else
			{
				System.out.println("fail");
			}	
		}
	}
}	