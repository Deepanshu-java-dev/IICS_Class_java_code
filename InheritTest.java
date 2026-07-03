// Inheritance Example.
class Rectangle
{
	int length,breadth;
	Rectangle(int l, int b)
	{
		length=l;
		breadth=b;
	}
	void calculate()
	{
		int mul= length*breadth;
			System.out.println("Length :"+length);
			System.out.println("Breadth:"+breadth);
			System.out.println("Area of Rectangle:"+mul);
	}
}
class Cuboid extends Rectangle
{
		int height;
	Cuboid(int l, int b,int z)
	{
		super(l,b);
		height=z;
	}
	void calculate()
	{
		int mul=length*breadth;
		int area = length*breadth*height;
			System.out.println("Length :"+length);
			System.out.println("Breadth:"+breadth);
			System.out.println("Height:"+height);
			System.out.println("Area of cuboid:"+area);
			System.out.println("Area of Rectangle:"+mul);
	}
}
class InheritTest
{
	public static void main(String[]args)
	{
		Cuboid ob =  new Cuboid(12,12,13);
		ob.calculate();
	}
}

