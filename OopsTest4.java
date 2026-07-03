class Ooptest4
{
	int a;
	int mul=1;
	public void getdata(int x)
	{
		a=x;
	}
	public void Calculate()
	{
		for(int i=a; i>=1; i--)
		{
			mul= mul*i;
		}
	}
	public void Show()
	{
		System.out.println("Factorial:"+mul);
	}
}
class OopsTest4
{
	public static void main(String[]args)
	{
		int x=Integer.parseInt(args[0]);
		Ooptest4 ob = new Ooptest4();
		ob.getdata(x);
		ob.Calculate();
		ob.Show();
	}
}