//Example for parameters & Arrgument

class Ooppardemo
{
	int l,b;
	int area=0;
	void getdata(int m , int n)
	{
		l=m;
		b=n;
	}
	void calculate()
	{
		area=l*b;
	}
	void Show()
	{
	System.out.println("Length :"+l);
	System.out.println("Breadth :"+b);
	System.out.println("Area of triangle :"+area);
	}
}
class OopParDemo
{
public static void main(String[]args)
{
	int x=Integer.parseInt(args[0]);
	int y=Integer.parseInt(args[1]);
	Ooppardemo ob= new Ooppardemo();
	ob.getdata(x,y);
	ob.calculate();
	ob.Show();
}
}