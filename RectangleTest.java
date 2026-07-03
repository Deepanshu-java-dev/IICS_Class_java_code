class RectangleReturn
{
	int length,breadth;
	viod getdata(int l,int b)
	{
		length=l;
		breadth=b;
	}
	void show()
	{
	System.out.println("Length :"+length);
	System.out.println("Breadth :"+breadth);
	}	
	viod calculate()
	{
		int m=length*breadth;
		return m;
	}
}
class RectangleTest
{
	public static void main(String[] args)
	{
		RectangleReturn ob= new RectangleReturn();
		ob.getdata(15,5);
		int a=ob.calculate();
	System.out.println("Area of triangle :"+a);
	}
}