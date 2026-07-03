import java.util.*;
class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<String> set= new TreeSet();
		set.add("one");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		set.add("Seven");
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());		
		}
	}
}