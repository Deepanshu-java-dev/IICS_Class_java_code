import java.util.*;
class SetDemo
{
	public static void main(String[] args)	
	{
		HashSet<String> names=new HashSet<String>();
		names.add("Naman");
		names.add("Deepak");
		names.add("Shreya");
		names.add("Naman");
		names.add("Deepak");
		System.out.println(names);
		System.out.println(names.contains("Deepak"));
		names.remove("Naman");
		System.out.println(names);
	}
}