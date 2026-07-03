class Ooptest1
{
	int a,b,c,d;
	public void GetData()
	{
		a=10;
		b=30;
	}
	public void Addition()
	{
		c=a+b;
	}
	public void Shows()
	{
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		System.out.println("Sum of a and b :"+ c);
	}
}
class OopsTest1
{
	public static void main(String[]args)
	{
		Ooptest1 ob= new Ooptest1 ();
		ob.GetData();
		ob.Addition();
		ob.Shows();
		
	}
}