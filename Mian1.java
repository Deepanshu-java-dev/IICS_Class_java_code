class Vechicle
{
	String brand;
	void honk()
	{
	System.out.println("Honk :"+brand);
	}
}
class Bike extends Vechicle
{
	int gearCount;
	void showGear()
	{
	System.out.println("Gear Count  :"+gearCount);
	}
}
class Mian1
{
	public static void main(String[]args)
	{
		Bike bi=new Bike();
		bi.brand="Hero";
		bi.gearCount=5;
		bi.honk();
		bi.showGear();
	}
}