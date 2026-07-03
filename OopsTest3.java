class Ooptest3
{
	int l,b;
	int Area=0;
	void getedata()
	{
		l=17;
		b=10;
	}
	void Calculate()
	{
		Area=l*b;
	}
	void Show()
	{
	System.out.println("Length :"+l);
	System.out.println("Breadth :"+b);
	System.out.println("Area of Triangle:"+Area);
	}

}
class OopsTest3
{
	public static void main(String[]args)
	{
		Ooptest3 ob=new Ooptest3();
		ob.getedata();
		ob.Calculate();
		ob.Show();
	}
}