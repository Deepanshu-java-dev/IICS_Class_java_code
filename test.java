class Test1
{
	public static void main(String[]args)
	{
	int maths=91;
	int phy=80;
	int eng=78;
	int chem=60;
	int hindi=50;
	int comp=34;
	int yoga=30; 
	
	System.out.println("Maths marks" + maths);
	
	System.out.println("Physics marks:" + phy);
	System.out.println("English marks:" + eng);
	System.out.println("Chemistry marks:" + chem);
	System.out.println("Hindi marks:" + hindi);
	System.out.println("Computer marks:" + comp);
	System.out.println("Yoga marks:" + yoga);
		int total= maths+phy+eng+chem+hindi+comp+yoga;

	int avg= total/7;

	System.out.println("Total marks:"+ total);
	System.out.println("Averaga marks:"+ avg);

		
	

	
		if (avg>=90)
	{	
	System.out.println("Grade:A+");
	}

			 else if (avg>=80)
	{	
	System.out.println("Grade:A");
	}

			else if (avg>=70)
	{	
	System.out.println("Grade:B");
	}

			else if (avg>=60)
	{	
	System.out.println("Grade:c");
	}

			else if (avg>=50)
	{	
	System.out.println("Grade:D");
	}

			else if (avg>=33)
	{	
	System.out.println("Grade:E");
	}
			else 
	{	
	System.out.println("Grade:F");
	}
	
	}
}