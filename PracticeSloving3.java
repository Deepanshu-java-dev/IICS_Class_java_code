class PracticeSloving3
{
	int a;
	int mul=1;	
	void getdata(int x)
	{
		a=x;
	}
	void calculate()
	{
	 	for(int i=a;i>=1;i--)
		{
			mul=mul*i;
		}
	}
	void show()
	{
		System.out.println("Factorial:"+mul);
	}
	public static void main(String[]args)
	{
		int m=Integer.parseInt(args[0]);
		PracticeSloving3 ob= new PracticeSloving3();
			ob.getdata(m);
			ob.calculate();
			ob.show();
		
	}
}