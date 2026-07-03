import java.util.*;
class HashQues
{
	public static void main(String[] args)
	{
		HashSet<Integer> num=new HashSet<Integer>();
		num.add(12);
		num.add(24);
		num.add(28);
		num.add(15);
		num.add(35);
		num.add(12);
		num.add(10);
		num.add(11);
		num.add(30);
		num.add(23);
		System.out.println(num);
		int a=23;
					if(num.contains(a))
			{
				System.out.println(a+": Founds");
			}
			else{
				System.out.println(a+": Not Founds");
			}
		
		

	}
}