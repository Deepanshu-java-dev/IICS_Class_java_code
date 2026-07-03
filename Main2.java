class Shape
{
	String color;
	void showColor()
	{
	System.out.println("Color :"+color);
	}
}
class Circle extends Shape
{
	double radius;
	void area()
	{
	System.out.println("Circle of radius:"+radius);
	}
}
class Rectangle extends Circle
{
	double width,height,Area;
	void area_()
	{
		Area=width*height;	
	System.out.println("Rectangle of Width :"+width);
	System.out.println("Rectangle of Height :"+height);
	System.out.println("Area Of Rectangle :"+Area);
	}
}
class Main2
{
public static void main(String[]args)
	{
	Rectangle re=new Rectangle();
	re.color= "Red";
	re.radius=2;
	re.width=10;
	re.height=18;
	re.Area=10*18;
	re.showColor();
	re.area();
	re.area_();
	
	}
}