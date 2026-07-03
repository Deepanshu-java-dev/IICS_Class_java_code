import java.util.*;
class TreeMapDemo
{
	public static void main(String[] args)
	{
		TreeMap<String,String> city=new TreeMap<>();
		city.put("England","London");
		city.put("India","New Delhi");
		city.put("Austria","Wien");
		city.put("Norway","Oslo");
		System.out.println(city);
		
		//city.remove("India");
		//String a=city.get("India");//use to get specific data
	}
}