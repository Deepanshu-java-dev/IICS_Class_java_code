interface Vehicle
{
	public abstract void start();
	public abstract void stop();
	public abstract int getSpeed();
}
class bike implements Vehicle
{	
	int speed;
 	public void start()
	{
		System.out.println("Bike Started");
		speed=0;
	}
	public void stop()
	{
	 System.out.println("Bike Stopped");
		speed=10;
	}
	public int getSpeed()
	{
		return speed;
	}
}
class car extends bike
{	
	int speed;
 	public void start()
	{
		System.out.println("Car Started");
		speed=0;
	}
	public void stop()
	{
	 System.out.println("Car Stopped");
		speed=10;
	}
	public int getspeed()
	{
		return speed;
	}
}
class Testvehicle
{
	public static void main (String[] args)
	{
		bike v = new bike ();
		v.start();
		System.out.println("Bike Speed : "+v.getSpeed());
		v.stop();
		System.out.println("Bike Speed : "+v.getSpeed());

		car c = new car();
		c.start();
		System.out.println("car Speed : "+c.getspeed());
		c.stop();
		System.out.println("car Speed : "+c.getspeed());
		
	}	
}