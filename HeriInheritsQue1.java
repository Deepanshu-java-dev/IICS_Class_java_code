class Vechical
{
	String name,fuel;
	void getdata()
	{
		System.out.println("Vechical Name:"+name);
		System.out.println("Fuel type  :"+fuel);
	}
}
class Bike extends Vechical
{
	String gear;
	void show()
	{
		System.out.println("Bike Name:"+name);
		System.out.println("Bike fuel type:"+fuel);
		System.out.println("Bike with gear or Non:"+gear);
	}
}
class Car extends Vechical
{
	String door;
	void display()
	{	
		System.out.println("Car Name:"+name);
		System.out.println("Car fuel type:"+fuel);
		System.out.println("Car Door:"+door);	
	}
}
class HeriInheritsQue1
{
	public static void main(String[]args)
	{
		Bike b=new Bike();
		b.name="Hero";
		b.fuel="Petrol";
		b.gear="Non Gear";	
		b.show();
		Car c= new Car();
		c.name="Swfit";
		c.fuel="Petrol with Cng";
		c.fuel="Automatics Gear";
		c.door="Two Door";
		c.display();
	}
}