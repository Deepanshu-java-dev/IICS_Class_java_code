import java.util.*;
class TreeSetDemo1
{
	public static void main(String[] args)
	{
		TreeSet<Integer> set= new TreeSet();
		set.add(10);
		set.add(2);
		set.add(8);
		set.add(4);
		set.add(5);
		set.add(9);
		set.add(3);
		Iterator<Integer> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());		
		}
	}
}