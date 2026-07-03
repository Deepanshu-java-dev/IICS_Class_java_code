import java.util.LinkedList;
class LinkedListEx
{
	public static void main(String[] args)
	{
		LinkedList<String> cars=new LinkedList<String>();
		cars.add("Volo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Swift");
		System.out.println(cars);
		// remove method 
			String remove=cars.removeLast();
			System.out.println("first car:"+remove);
			System.out.println("List Remains:"+cars);                       
		// get method 
			String get=cars.getFirst();
			System.out.println("first car:"+get);
			  
	}
}		 