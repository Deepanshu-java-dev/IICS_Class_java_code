import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorSum
{
	public static void main(String[] args)
	{
		int a=12;
		int b=66;
		int sum=0;
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(a);
		numbers.add(b);

	System.out.println("Traversing the list :");
		for(int num:numbers)
		{
			System.out.println(num);
			sum=sum+num;
		}

		System.out.println("\nSum : "+sum);
	}
} 