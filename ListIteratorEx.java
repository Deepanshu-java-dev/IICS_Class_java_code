import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorEx
{
	public static void main(String[] args)
	{
		ListIterator litr=null;
		List names=new ArrayList();
		names.add("Shyam");
		names.add("Shiva");
		names.add("Tom");
		names.add("Paul");
		names.add("Kate");

		// obtaining list iterator
		litr=names.listIterator();
		System.out.println("Traversing the list in forward direction:");
		
			while(litr.hasNext())
			{
				System.out.println(litr.next());
			}
			System.out.println("\nTraversing the list in forward direction:");
				while(litr.hasPrevious())
				{
					System.out.println(litr.previous());
				}
	}
} 