package Findout;
public class Pack2
{
	int a,b,r;
	int area;
	public void rect(int a,int b)
	{
		area= a*b;
	System.out.println("Area of Rectangle : "+area);
	}
	public void square(int p)
	{
		area= p*p;
	System.out.println("Area of Square : "+area);
	}
	public void triangle(int x ,int y)
	{
		area=x*y;
	System.out.println("Area of triangle : "+area);
	}
	
}