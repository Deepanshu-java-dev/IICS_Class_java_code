class Partest1
{
	int a;
	int mul;
	public void getdata(int n)
	{
		a=n;
	}
	public void calculate()
	{
		mul=0;
		for(int i=a;i>=1;i--)
		{
			mul=mul*i;
		}
	}
	public void shows()
	{
	System.out.println("Factorial :"+mul);
	}
}
class ParTest1
{
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		Partest1 ob = new Partest1();
		ob.getdata(x);
		ob.calculate();
		ob.shows();
	}
}